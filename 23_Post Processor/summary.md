## Section 23 - Post Processor
Rangkuman ini berisi:
1. Pengertian Post Processor
2. JSON Extractor
3. JSON Path

## Pengertian Post Processor
Elemen test plan yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan sampler request. Post processor ini biasanya digunakan untuk mengekstrak nilai tertentu dari reponse sebuah sampler request, contohnya kita dapat mengekstrak nilai variabel sebuah sesi HTTP request dan meneruskan nilainya ke request selanjutnya.

## JSON Extractor
[JSON Extractor](https://jsonpath.com/)

## JSON Path
-> digunakan untuk ekstrak isi dari JSON response
Beberapa ekspresi yang umum digunakan:
1. $ = root element
2. . = child operator (object)
3. [] = child operator (array)
4. .. = recursive descent (langsung ke objek)
5. * = wildcard (all things)
6. [start:end] = array slice operator borrowed