#!/bin/bash
forever start bin/www
forever --fifo logs 0