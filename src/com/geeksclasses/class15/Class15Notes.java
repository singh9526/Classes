package com.geeksclasses.class15;

/**
 * 
 * Start 10:00 AM 
 * 
 * Q1. Base Conversion, given a number system with 1 missing number, perform arithmatic operations in that
 *     number system. for ex : missing 8, so it is a base 9 number system, perform arithmatics in base 9 then
 *     convert it to base 10.
 * Q2. Binary Search Overflow problems. Ex for a given expression ax + bx^2 + c Logx, Find x such 
 *     that F(x) = N. Use Incremental Binary Search instead.
 * Q3. Stock Buy Sell Problem variations : 
 *     1. Maximize profit, 1 transaction starts after the other any number of times.
 *     2. Buy sell only once.
 *     3. Buy sell k number of times.
 *	   4. Stock Buy and Sell to maximize time.
 *
 * ------------ 11:00 AM
 * 
 * Q4. Job Scheduling problem. (Greedy known but issue in understanding the problem.)
 * 
 * 	------------------ 12:15 PM
 * 
 * 													SYSTEM DESIGN
 * 												    /			\
 * 									OOD/Design Patterns 		System Design
 * 
 * System Design has 2 aspects :	
 * 
 * - Scalability :
 * 100 TPS (Transactions per second) to 1000 TPS (Transactions per second)
 * 
 * - Availability :
 * Should never be down
 * 
 * (watch a youtube lecture of about 1 hour on AWS)
 * AWS - EC2 (When CPU is required, ex : All java code is kept here)
 *     - S3  [CDN] (When CPU not required, for static content. Ex : HTML, CSS, JS files etc)
 *     
 * - Load Balancer (If a system handles 100 TPS we want 1000 TPS, we simply replicate java code on 10 machines
 * 					and keep a load balancer to distribute load on all the machines)
 * 
 * 						Replicas
 *           			 /[]\
 *          			/ [] \
 * 	Load Balancer	[]--- []  --- []  DB
 *          			\ [] /
 *           			 \[]/
 * 
 * Load Balancing Algorithms are used :
 * 1. Round Robin
 * 2. Weighted Round Robin (Depending on which system has more RAM etc)
 * 
 * To handle DB Scale
 * - MASTER SLAVE ARCHITECUTURE is used
 * we write to master and read from slaves.
 * 
 * To improve writing Sharding is used.
 * 
 * 
 * ----- 12:41 PM
 * 
 * Q1. Design OYO Rooms.
 * Soln :
 * 
 * 
 * 1. OOD (classes)
 * 
 * - Design Entities
 * 
 * 	- User
 * 		- id
 * 		- name
 *      - age
 *      - sex
 *      - Address (Class)
 *      - Mob
 *      - email 	
 * 
 * 	- Hotel
 * 		- id
 * 		- name
 * 		- address
 * 		- city
 * 		- List<Rooms>
 * 		- rating
 * 		- List<facilities> (List of strings or Enums)
 * 
 * 	- Room
 * 		- no
 * 		- status (Occupied/Available)
 * 		- type (single/double/suite)
 * 		- charge
 * 
 * 	- Bookings
 * 		- id
 * 		- hotel_id
 * 		- amound
 * 		- user_id
 * 		- Date
 * 		- Status
 * 		- Payment Status
 * 		- Payment Details (Card/Paytm to make refund easier)
 * 		- List<Room>
 * 
 * - How to give unique IDs to a user if having thousands requests in a single millisecond?
 * 
 * 	DB Indexing (2 Types) :
 * 	- Hashmap Based (for exact value)
 * 	- Tree Based (For range based queries)
 * 
 * 	DB Caching :
 * 	  We have 
 * 
 * 			API Layer  |  Cache Layer   |  DB Layer
 * 
 *  Session Cookies
 *  Sticky Cookies.	
 * 
 * 2. System Design (Scalability/load balancing/ db layer)
 * 
 * 
 * -------
 * 
 * Object Pool Design Pattern :
 * - If object creation is very costly, we create a pool of pre-created objects. So when we need a new object,
 * we fetch an object from pool, use it and then put it back in the pool.
 * 
 * - Used in Thread Pool
 * - Connection Pool
 * 
 * Ex : Java String Pool, for static strings.
 *
 * Q Implement Object Pool Design Pattern.
 * 
 * */

public class Class15Notes {

	public static void main(String[] args) {
		int num = 'b' - 'a';
		System.out.println(num);
	}

}
