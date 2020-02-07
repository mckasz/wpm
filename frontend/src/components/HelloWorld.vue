<template>
    <div class="hello">
        <h1>{{ msg }}</h1>
        <h3>Available cars:</h3>
        <ul class="car-list">
            <car-component v-for="car in cars" :car="car" :key="car.vin"/>
        </ul>
    </div>
</template>

<script>
    import CarComponent from "./CarComponent";

    export default {
        name: 'HelloWorld',
        components: {CarComponent},
        props: {
            msg: String
        },

        data() {
            return {
                cars: [
                    {
                        vin: "123",
                        numberOfSeats: 7,
                        type: "Ford",
                        image: require("@/assets/ford.jpeg"),
                        transmission: "Manual",
                        airCondition: true
                    },
                    {
                        vin: "345",
                        numberOfSeats: 5,
                        type: "Toyota",
                        image: require("@/assets/toyota.jpeg"),
                        transmission: "Manual",
                        airCondition: true
                    }
                ]
            }
        },
        created: function () {
            this.$http.get('https://localhost:8080/cars')
                .then(response => {
                    console.log(response.data)
                });
        }

    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h3 {
        margin: 40px 0 0;
    }

    ul {
        list-style-type: none;
        padding: 0;
        width: 1000px;
        margin: auto;
    }

    .car-list {
        margin-top: 20px;
    }
</style>
