# JavaLab1

Лабораторная работа №1 по языку программирования Java. Содержит реализацию различных методов и алгоритмов для работы с базовыми конструкциями языка.

## 📋 Содержание

- [Описание](#описание)
- [Структура проекта](#структура-проекта)
- [Задания](#задания)
- [Класс MyRandom](#Класс-MyRandom)
- [Класс CheckInput](#Класс-CheckInput) 

## 🎯 Описание

Проект представляет собой консольное приложение, содержащее набор методов для:
- Работы с различными типами данных
- Создание и обработки массивов (в том числе случайным образом)
- Реализации базовых алгоритмов
- Взаимодействия с пользователем через консоль
- Проверка корректрости ввода

## 📁 Структура проекта
JavaLab1/

├── src/ # Исходный код

│ ├── Main.java # Главный класс с меню

│ ├── CheckInput.java # Утилиты для проверки ввода, а также создания и вывода массивов

│ ├── Test.java # Реализация методов заданий

│ └── MyRandom.java # Реализация методов создания случайных чисел и массивов

├── README.md # Этот файл

└── .gitignore # Git ignore файл

## 📚 Задания

### Реализованные методы:

1. **Вычисление дробной части числа** - `fraction(double x)`

  Берем исходное число x  
  
  Отбрасываем целую часть через приведение к (int)  
  
  Возвращаем разность x - (int)x  

<img width="545" height="111" alt="{626A0550-A149-46FF-95F9-B7037E37586B}" src="https://github.com/user-attachments/assets/c7e5e1ec-ae05-4ece-8cf9-de878d5f06de" />  

2. **Преобразование символа в соответствующее число** - `charToNum(char x)`
  
  Берем символ x (например, '7')  
  
  Используем коды ASCII: '0' = 48, '1' = 49, ...  
  
  Вычитаем код '0': (int)x - 48  

<img width="299" height="114" alt="{A9E2DE29-DC26-4711-A94B-8EE9A5F58AE8}" src="https://github.com/user-attachments/assets/1302779d-a4a0-48db-8f26-fad58311173d" />

3. **Проверка двузначности числа** - `is2Digits(int x)`
  
  Делим число на 10 - если результат != 0, значит >= 10
  
  Делим на 100 - если результат = 0, значит < 100
  
  Оба условия должны быть true

<img width="586" height="116" alt="{70A00148-EB6D-4D37-89E5-BDC57346AD47}" src="https://github.com/user-attachments/assets/93f6b08c-a47b-4003-b975-504466cd1925" />
<img width="591" height="84" alt="{A570B236-3953-4AFC-9908-F8755B6F7B67}" src="https://github.com/user-attachments/assets/bba2828e-b00e-45e0-ae85-cd26269636b4" />
<img width="611" height="112" alt="{D2C6CD57-2AC0-4F9D-BD9A-6E80C8424141}" src="https://github.com/user-attachments/assets/b20f9779-1ba4-4bc7-a499-400af8eda7a3" />

4. **Проверка, вхождения числа num в промежуток [a,b], отношение a и b заранее неизвестно** - `isInRange(int a, int b, int num)`  
  
  Определяем границы диапазона (неизвестно, что больше)
  
  Если a > b, проверяем b < num < a
  
  Иначе проверяем a < num < b

<img width="442" height="282" alt="{216F559B-504D-4EFA-A35B-B52E39D5F805}" src="https://github.com/user-attachments/assets/f4bda8a0-4369-4bdb-9a98-c729ceb21114" />
<img width="387" height="267" alt="{1612B5D5-2343-4346-AFD8-178F760B4D7D}" src="https://github.com/user-attachments/assets/14897209-3e94-4030-8e42-23fe9c563dcd" />
<img width="430" height="239" alt="{B5771330-A244-4815-BE0C-CCC96AAAFFC3}" src="https://github.com/user-attachments/assets/8e6cfd6c-32ee-4e86-9175-a5d3fc36af1e" />

5. **Проверка равенства трех введенных чисел** - `isEqual(int a, int b, int c)`  
  
  Проверяем, что a == b
  
  И что a == c
  
  Если оба условия true - все числа равны

<img width="313" height="259" alt="{B209D44F-804A-459C-95A0-CC81AD2EC9A9}" src="https://github.com/user-attachments/assets/b625e3b2-4f57-4fa3-a125-a4ae1187322a" />
<img width="334" height="275" alt="{04D181B9-023E-4A1E-A6BF-C9FEE154270A}" src="https://github.com/user-attachments/assets/3a809d6a-1fdb-4241-838e-c0c62c15c1db" />

6. **Возврат модуля числа** - `abs(int x)`  
  
  Проверяем, отрицательное ли число
  
  Если x < 0, умножаем на -1
  
  Иначе возвращаем как есть

<img width="508" height="113" alt="{1B222DA2-3F13-44DB-96C1-1F684F0FBB7C}" src="https://github.com/user-attachments/assets/abc84b1d-7971-4823-9aea-551cc09022ce" />
<img width="491" height="122" alt="{629CCF0A-9197-4073-9EF5-4A9B332C6103}" src="https://github.com/user-attachments/assets/274a4ca9-271b-4e67-bbcf-cb586d08344f" />
<img width="506" height="126" alt="{069EDC57-0D9F-489F-B92B-C77838BF0B60}" src="https://github.com/user-attachments/assets/61d319bf-8e0a-4885-9c79-dae99ad750f9" />

7. **Проверка делимости число либо на 5, либо на 3, не одновременно** - `is35(int x)`  
  
  Проверяем делимость на 5: x % 5 == 0
  
  Проверяем делимость на 3: x % 3 == 0
  
  Возвращаем true только если выполняется одно условие

<img width="795" height="95" alt="{8916E45E-13C3-41EE-A1AE-ABEFD0E067BB}" src="https://github.com/user-attachments/assets/14680879-daa0-478d-a1bb-d54affcee0c0" />
<img width="817" height="91" alt="{A79D81DC-4025-4C72-AC12-F7A6216B500F}" src="https://github.com/user-attachments/assets/070fc532-8346-4988-a9b6-abb0fadd406e" />
<img width="783" height="132" alt="{EB791704-F7A3-483E-8938-CF891EA69ADC}" src="https://github.com/user-attachments/assets/b09ed10a-68a9-40ee-b217-ca36af6c18fb" />

8. **Поиск максимального из трех чисел** - `max3(int x, int y, int z)`  
  
  Предполагаем, что x - максимальный
  
  Сравниваем с y - если больше, обновляем максимум
  
  Сравниваем с z - если больше, обновляем максимум

<img width="280" height="227" alt="{808DBA59-19D7-47E3-83A1-B2B334132DDE}" src="https://github.com/user-attachments/assets/99ae7eb8-9c36-4a16-83dc-55172f99cbb8" />

9. **Нахождение сумы двух чисел и возврат числа 20, если сумма варьируется между 10 и 19 включительно** - `sum2(int x, int y)`  
  
  Вычисляем сумму x + y
  
  Если сумма в диапазоне [10, 19], возвращаем 20
  
  Иначе возвращаем обычную сумму

<img width="659" height="235" alt="{286AD631-C65C-49E0-B736-2F6C9E651F98}" src="https://github.com/user-attachments/assets/8238b887-b7af-43c9-8839-a72377244ba1" />
<img width="657" height="221" alt="{DA9C63F5-3802-4C26-8EFB-4915140C3281}" src="https://github.com/user-attachments/assets/87fa7982-7777-492f-9178-239da6138b5f" />

10. **Определение дня недели** - `day(int x)`  
  
  Используем switch-case для чисел 1-7
  
  Для каждого числа возвращаем соответствующую строку
  
  Для других чисел возвращаем сообщение об ошибке

<img width="539" height="125" alt="{351F76A9-DA7E-411E-B33C-B10D920403D2}" src="https://github.com/user-attachments/assets/7e797bf0-3487-42b6-a8aa-dffc9fc4507b" />
<img width="570" height="103" alt="{981EB173-13AA-4CC5-A4F9-937F98070D11}" src="https://github.com/user-attachments/assets/109c5206-95f1-4de7-ae33-d215d031da1a" />

11. **Возврат строки, в которой будут записаны все числа от 0 до x** - `listNums(int x)`  
  
  Инициализируем пустую строку
  
  Циклом от 0 до x добавляем каждое число в строку
  
  Добавляем пробел после каждого числа

<img width="406" height="151" alt="{76D50988-8044-4BDF-8B3C-D5E72AAF195F}" src="https://github.com/user-attachments/assets/ab7bed25-8df1-4891-a57a-692dcd7bc031" />

12. **Подсчет количества цифр в числе** - `numLen(long x)`  
  
  Обрабатываем особый случай x = 0 -> возвращаем 1
  
  Если отрицательное - берем модуль
  
  Делим число на 10 пока не станет 0, считая итерации

<img width="409" height="128" alt="{FD69F26A-A299-448D-BDF0-140911C6EDA9}" src="https://github.com/user-attachments/assets/e2bdcbb7-cf28-4f42-9d7f-44f373185a96" />
<img width="420" height="141" alt="{704029F8-38B1-4035-9516-D31626F04B11}" src="https://github.com/user-attachments/assets/c9d1b092-1108-423e-bc35-3bffa86d50b4" />
<img width="442" height="135" alt="{E59AEDB6-9436-4FF9-A6A9-5EED3AD6EA5C}" src="https://github.com/user-attachments/assets/f593cb55-8884-44d4-a30a-0cdbead4e645" />

13. **Рисование квадрата** - `square(int x)`  
  
  Внешний цикл по строкам (i от 0 до x-1)
  
  Внутренний цикл по столбцам (j от 0 до x-1)
  
  В каждой ячейке печатаем '*'
  
  После каждой строки - переход на новую строку

<img width="357" height="151" alt="{FA06901D-39FF-4A31-9413-5E9F3DBD3EE8}" src="https://github.com/user-attachments/assets/96ef67ea-5974-46ed-9f9d-7be263e22b78" />
<img width="382" height="300" alt="{862E941A-9A2A-4C95-83E4-D2290CA36C16}" src="https://github.com/user-attachments/assets/d0e67ac6-6238-43a2-b09b-f6347ba0adec" />

14. **Рисование правого треугольника** - `rightTriangle(int x)`  
  
  Цикл по строкам от 1 до x
  
  Печатаем пробелы: x - i штук
  
  Печатаем звездочки: i штук
  
  Переход на новую строку

<img width="405" height="219" alt="{383843E0-0A2B-4A48-9007-192B8F962B52}" src="https://github.com/user-attachments/assets/e7354e54-4ffb-4745-9c8c-98096b7cc3bd" />

15. **Поиск первого вхождения в массиве** - `findFirst(int[] arr, int x)`  
  
  Линейный поиск по массиву
  
  Сравниваем каждый элемент с x
  
  При первом совпадении возвращаем индекс
  
  Если не нашли - возвращаем -1

<img width="698" height="315" alt="{6A9C93F6-5C65-4D14-911B-15D54ED7664F}" src="https://github.com/user-attachments/assets/6bda6098-5537-4761-9c61-b119fd2e6389" />
<img width="697" height="646" alt="{F7AE862C-08A9-4B85-A0F0-664998FAAE71}" src="https://github.com/user-attachments/assets/1510f1c1-c233-44db-9461-995b82b1c235" />

16. **Поиск максимального по модулю значения** - `maxAbs(int[] arr)`  
  
  Проверяем пустой массив -> возвращаем 0
  
  Берем модуль первого элемента как начальный максимум
  
  Проходим по массиву, сравнивая модули элементов
  
  Возвращаем наибольший модуль

<img width="695" height="269" alt="{16624E4D-E48A-46B7-8F12-C9E519B7C467}" src="https://github.com/user-attachments/assets/1cc0df4f-67e1-484e-9633-3fd38012a942" />
<img width="425" height="95" alt="{0F3BE2C0-1018-4D5F-B0CE-C038A94E8783}" src="https://github.com/user-attachments/assets/4d7c5092-9dde-4c58-a0c3-b37ac19b5976" />

17. **Вставка массива в массив** - `add(int[] arr, int[] ins, int pos)`  
  
  Создаем новый массив длины arr.length + ins.length
  
  Копируем элементы до позиции pos из arr
  
  Вставляем все элементы из ins
  
  Копируем оставшиеся элементы из arr

<img width="789" height="546" alt="{228FD20A-0AD3-4438-BB78-B1B6F1764F33}" src="https://github.com/user-attachments/assets/5502fa41-0b98-4555-b2c2-74d1da42c73c" />

18. **Разворот массива** - `reverseBack(int[] arr)`  
  
  Создаем новый массив той же длины
 
  Заполняем его в обратном порядке
  
  result[i] = arr[arr.length - 1 - i]

<img width="702" height="280" alt="{A6BEB9A2-404C-42EC-BE02-6B0E00C21212}" src="https://github.com/user-attachments/assets/f2f85fdc-aeae-4410-8536-e98485f066c7" />

19. **Поиск всех вхождений в массиве** - `findAll(int[] arr, int x)`  
  
  Первый проход: считаем сколько раз встречается x
  
  Создаем массив результата нужного размера
  
  Второй проход: записываем индексы вхождений

<img width="680" height="367" alt="{BD8CF129-21C8-4806-9B59-888136C9915E}" src="https://github.com/user-attachments/assets/94c263bf-a2b5-489e-9b9b-a1a0db7b6941" />

20.**Возврат строки, в которой будут записаны все четные числа от 0 до x** - `chet(int x)`  
  
  Инициализируем пустую строку
  
  Циклом с шагом 2 (0, 2, 4, ...) до x
  
  Добавляем каждое число в строку с пробелом

<img width="605" height="177" alt="{424F9176-4C3C-424D-A595-AC0D585AB3DA}" src="https://github.com/user-attachments/assets/8681afef-88dc-4bf6-87ab-a6444d75a85c" />

## 🎲 Класс MyRandom

### Реализованные методы:

1. **Возвращает случайное число** - `getRandNum()`  
  
  Вызов random.nextInt(10)
    Генерирует случайное целое число в диапазоне [0, 9]
    nextInt(10) возвращает значения: 0, 1, 2, ..., 9
  Добавление 1
    Преобразует диапазон [0, 9] в [1, 10]
    Формула: 0 + 1 = 1, 1 + 1 = 2, ..., 9 + 1 = 10
  Возврат результата
    Возвращает случайное число от 1 до 10 включительно

2. **Возвращает массив с ограниченно случайным количеством случайных символов** - `getRandArr(int amount)`  
  
  Создание массива
    int[] array = new int[amount]
    Создает массив целых чисел заданного размера amount
  Заполнение массива в цикле
    Цикл от i = 0 до i < amount  
    Для каждого индекса i:
    Вызывает getRandNum() для получения случайного числа
    Присваивает array[i] = полученное_число
  Возврат заполненного массива
    Возвращает массив, заполненный случайными числами от 1 до 10

*Примеры использования описанных метовов можно увидеть в заданиях 15-19*

## 🔧 Класс CheckInput

### Реализованные методы:

1. **Метод проверяет, является ли строка целым числом** - `isInteger(String str)`   
  
 ПОПЫТАТЬСЯ:
   Преобразовать строку в целое число с помощью Integer.parseInt(str)
   ВЕРНУТЬ true (преобразование успешно)
 ЕСЛИ возникло исключение NumberFormatException:
   ВЕРНУТЬ false (строка не является целым числом)
   
2.  **Метод проверяет, является ли строка числом с плавающей точкой** - `isDouble(String str)`  

  ПОПЫТАТЬСЯ:
    Преобразовать строку в double с помощью Double.parseDouble(str)
    ВЕРНУТЬ true (преобразование успешно)
  ЕСЛИ возникло исключение NumberFormatException ИЛИ NullPointerException:
    ВЕРНУТЬ false (строка не является числом с плавающей точкой)

4. **Метод проверяет корректность long-числа с дополнительной валидацией** - `isValidLong(String str)`  

  Установить startIndex = 0
  ЕСЛИ первый символ строки == '-':
    ЕСЛИ длина строки == 1:
      ВЕРНУТЬ false (только минус без цифр)
    ИНАЧЕ:
      Установить startIndex = 1

  ДЛЯ каждого символа с позиции startIndex до конца строки:
    ЕСЛИ символ не в диапазоне '0'-'9':
      ВЕРНУТЬ false (найден нецифровой символ)
  
  ПОПЫТАТЬСЯ:
    Преобразовать строку в long с помощью Long.parseLong(str)
    ВЕРНУТЬ true
  ЕСЛИ возникло исключение NumberFormatException:
    ВЕРНУТЬ false (число вне диапазона long)

4. **Метод гарантированно возвращает целое число с обработкой ошибок** - `getInteger(Scanner scanner)`  

  БЕСКОНЕЧНЫЙ ЦИКЛ:
    Считать строку ввода от пользователя
  ЕСЛИ isInteger(input) возвращает true:
    Преобразовать строку в целое число
    ВЕРНУТЬ число
  ИНАЧЕ:
    Вывести сообщение об ошибке
    Продолжить цикл для повторного ввода

6. **Метод возвращает long-число с проверкой диапазона и формата** - `getLong(Scanner scanner)`  

  БЕСКОНЕЧНЫЙ ЦИКЛ:
    Считать строку ввода и удалить пробелы по краям
    ЕСЛИ isValidLong(input) возвращает true:
      Преобразовать строку в long и ВЕРНУТЬ результат
    ИНАЧЕ:
      Вывести сообщение об ошибке
      Предложить повторный ввод

8. **Метод запрашивает выбор из двух вариантов (1 или 2)** - `getNumb12(Scanner scanner)`  

  Вывести приглашение с вариантами выбора
  БЕСКОНЕЧНЫЙ ЦИКЛ:
    Считать строку ввода
    ЕСЛИ isInteger(input) возвращает true:
      Преобразовать строку в целое число m
      ЕСЛИ m >= 1 И m <= 2:
        ВЕРНУТЬ m (корректный выбор)
      ИНАЧЕ:
        Вывести сообщение об ошибке диапазона
    ИНАЧЕ:
      Вывести сообщение об ошибке формата

10. **Метод заполняет массив целыми числами** - `getIntArray(Scanner scanner, int amount)`  
  
  Создать новый массив целых чисел размером amount
  ДЛЯ i от 0 до amount-1:
    Вывести приглашение для ввода i+1 элемента
    Получить целое число с помощью getInteger(scanner)
    Записать число в массив по индексу i
  ВЕРНУТЬ заполненный массив

11. **Метод выводит массив в форматированном виде** - `outArray(int[] arr, int amount)`  
  Вывести заголовок "Ваш массив:"
  Создать строку array = "[ "
  ДЛЯ i от 0 до amount-1:
    Преобразовать arr[i] в строку и добавить к array с пробелом
  Добавить закрывающую скобку "]" к array
  Вывести полученную строку






