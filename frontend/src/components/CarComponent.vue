<template>
    <li class="item">
        <b-container>
            <b-row>
                <b-col>
                    <img :src="car.image" :alt="car.type">
                </b-col>
                <b-col>
                    <ul class="description">
                        <li><h4>{{car.type}}</h4></li>
                        <li>{{car.numberOfSeats}} Passengers</li>
                        <li>{{car.transmission}} Transmission</li>
                        <li v-show="car.airCondition">Air conditioning</li>
                    </ul>
                </b-col>
            </b-row>
        </b-container>
    </li>
</template>
<script>
    export default {
        name: 'car-component',
        props: {
            car: Object
        }
    }
</script>
<style scoped>
    h3 {
        margin: 40px 0 0;
    }

    .item {
        display: block;
        margin: 15px 0;
        padding-bottom: 10px;
        border-bottom: 1px solid grey;
    }

    a {
        color: #42b983;
    }

    .description {
        list-style-type: none;
        margin: 0;
        padding: 0;
        text-align: left;
    }

    .description li {
        display: block;
    }
</style>