## Section 24 - Understanding JMeter Result
Rangkuman ini berisi:
1. Tahapan Open JMeter
2. Create your Test Plan
3. Throughput

## Tahapan Open JMeter
1. Open Terminal
2. Navigate to bin folder 
3. Run JMeter

## Create your Test Plan
1. HTTP Request Defaults : https://reqres.in/
2. Get List Users : /api/users/3
3. Post User: /api/users/
Body Data:
{
    "name" : "${nama}",
    "job" : "Student ALTA"
}
4. CSV Nama File
5. Response Assertion:
Select Radio Button Response Code
Fill Pattern to test with 201
6. Before run your test, please save the test plan and save all listener with different name in /desktop/This-is-your-report.jmx

## Throughput
Throughput = (number of requests) / (total time) * conversion

Where:

number of requests = number of executed requests

total time = (lastSampleStartTime + lastSampleLoadTime – firstSampleStartTime)

conversion : the unit of conversion value, example 100 will convert value to the second, 1000*600 will convert the value to the minute, etc.