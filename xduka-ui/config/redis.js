var redisClient = require('redis');

// get enviroment variables
var redis_host = process.env.REDIS_HOST;
var redis_port = process.env.REDIS_PORT;
var redis_db = process.env.REDIS_DB;


module.exports = {
    host: redis_host,
    port: redis_port,
    db: redis_db,
    ttl: (60000 * 24 * 30),
    redisClient: redisClient.createClient(redis_port,redis_host) // connect to redis
};