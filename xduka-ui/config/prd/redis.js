var redisClient = require('redis').createClient();

module.exports = {
    host: 'redis',
    port: 6379,
    db: 0,
    ttl: (60000 * 24 * 30),
    client: redisClient
};