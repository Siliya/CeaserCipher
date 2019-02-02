# CeaserCipher
Decryption of Ceaser Cipher
Имена: Силия Иванова
Дата: 2018-02-02
Предмет: Увод в програмирането с Java
Имейл: siliya.ivanova@gmail.com
GitHub: https://github.com/Siliya/CeaserCipher 

Разбиване на Цезар Шифър

1.	Условие:

Имаш опцията да въведеш криптирания текст. Той трябва да е само с главни или само с малки букви.
Извежда се разшифрования текст.

2.	Въведение:

Приложението е реализирано на платформа на Java.


3.	Теория:

В текущата програма алгоритъмът проверява, кои са най-често срещаните букви в текста като се знае, че най-често срещаните букви в английския са ‘e’, ‘t’ и ‘h’. Така програмата пресмята колко е отместването от тях до ‘e’, ‘t’ и ‘h’ и извежда трите варианта на първоначалния текст, с опция, ако потребителя не е доволен да се изведат и останалите 23 варианта. 

4.	Използвани технологии: 

Интегрирана среда за разработване на компютърен софтуер - ItelliJ IDEA.

5.	Инсталация и настройки:

Трябва да имате инсталирана Java на компютъра си, която може да инсталирате от тук: https://www.java.com/en/download/ .

6.	Кратко ръководство на потребителя:

Стартирайте програмата и въведете текста, който искате да бъде декриптиран. 

7.	Примерни данни:

Въвеждате криптирания текст, стартирате програмата и виждате изходящия резултат в конзолата, който ще бъде вашето разшифровано съобщение. 
Въведен текст: “cneg bs gur wbhearl vf gur raq“ 
Преведен текст: „part of the journey is the end“ .

8.	Описание на програмния код:
enMessage – криптирания текст
mostFrequent – най-често срещаната буква
temp -  временна променлива, с която броя 
bestNumber – променлива, от която изчислявам
messageArray – масив, който превръща съобщението от char-ове в масив и го реже и него вече може да го обхождаме в цикъл и да извеждаме с условни конструкции различни варианти 

9.	Предимства:
Програмата е лесна за използване. Може да се използва, ако искате да си изпращате криптирани съобщения с колегите без шефа ви да ги разбере. За да разконспирирате плановете на Цезар, да завладеете Рим, да започнете гражданска война, а и просто за забавление. 

10.	Източници: 

https://stackoverflow.com/
https://github.com/
https://www.youtube.com/

