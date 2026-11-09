Group 1   

    Aguanta, Job Marco Angelus G.  
    Baran, Antontio Ymanuel A.  
    Pesirla, Adrian Laurence R.   
    Villaflor, Inigo Dominique 
    Villarta, John Lhendon P.  

CRA2 PARKING MANAGEMENT SYSTEM  

A parking lot time tracker and payment system built with Java Swing. Each vehicle gets a slot and a ticket on entry, its parking time is tracked, and the fee is computed from the duration when it exits.

How it works

Flow: Car Enters → Slot Assignment → Time Tracking → Payment → Exit

The vehicle type is detected from the plate number: 6 digits = Motorcycle, 7 digits = Car.
A free slot of the matching type is assigned. The slot (e.g. C03) is printed on the ticket.
The time in is recorded at entry. On exit, the fee is the hours parked (rounded up, minimum 1) multiplied by the hourly rate.
