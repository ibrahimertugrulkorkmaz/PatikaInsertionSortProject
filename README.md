# **Patika dev Insertion Sort Projesi**
 
### Insertion Sort Nedir?

Insertion Sort, bilgisayar bilimlerinde kullanılan ve sıralı diziyi her adımda öge öge oluşturan bir sıralama algoritmasıdır. Insertion Sort Algoritması, düzensiz dizi elemanlarını tek tek ele alarak her birini dizinin sıralanmış kısmındaki uygun yerine yerleştirme esasına dayanır. Genelllikle günlük hayatımızda farketmeden kullandığımız bir çözüm yöntemidir. Küçük boyutlu dizileri sıralamada hızlı olsa da çok sayıda veriyi sıralarken Insertion Sort diğer sıralama yöntemlerine göre çok yavaş kalmaktadır.

--------------------------------------------
### Insertion Sort Sözel Çalışma Mantığı

- Algoritmada, ikinci elemandan başlayarak elemanın kendinden önceki elemanlarla karşılaştırılması yoluyla büyük elemanlar dizide sağa doğru kaydırılır. 
- Açılan uygun pozisyona o anda sıralanmakta olan eleman yerleştirilir. Yani, algoritmanın küçükten büyüğe sıralama yaptığı düşünülürse, sayı dizisinin ikinci elemanını kendisine anahtar eleman olarak seçer.
- Kendisinden büyük olan her sayıyla yerleri değiştirir.
- Ardından dizinin son elemanına kadar anahtar sayı seçimi ve devamındaki tüm işlemler devam eder. 

---------------------------------------------

### Java ile yazılmış örnek kod bloğu

>PatInsertionSort.java adlı dosyada kodun orijinal hali bulunmaktadır.

```java

public class PatInsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {22,27,16,2,18,6};    
        System.out.println("Insertion Sort Siralamasi Yapilmadan Once");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); // Array'i sortladigimiz kisim    
           
        System.out.println("Insertion Sort Siralamasi Yapildiktan Sonra");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    

```

-----------------------------------

### Örnek Kodu Çıktısı

![Örnek Kodu Çıktısı]()

-----------------------------------
## **1. Soruda verilen dizinin Insertion Sort sıralama algoritmasına göre aşamaları**
-----

* Soruda verilen dizinin ilk hali

 ```
[22,27,16,2,18,6]
```
-----

* Insertion sort dizinin en düşük değeri dizinin dördüncü indisindeki değer olduğu için, ilk indis ile dördüncü indis yer değiştirir.
```
1-[2,27,16,22,18,6]
```
---

* Dizinin ikinci en küçük değeri son indisteki altı değeri olduğu için altıncı indis ile ikinci indis yer değiştirir.
    
```
1-[2,27,16,22,18,6]
2-[2,6,16,22,18,27]
```
---

* Dizinin üçüncü indisine bakılır. 16 değeri kalan indislerin değerine göre en küçük değer olduğu için sıralamada değişiklik yapılmaz.

```
1-[2,27,16,22,18,6]
2-[2,6,16,22,18,27]
3-[2,6,16,22,18,27] -->En küçük değer 16 olduğu için değişiklik olmaz.
```
-----
    
    
* Dizinin dördüncü indisine bakılır. Bu indise gelebilecek en küçük değer olan on sekiz değeri ile yirmi iki değeri yer değiştirir.
```
1-[2,27,16,22,18,6]
2-[2,6,16,22,18,27]
3-[2,6,16,22,18,27] --> En küçük değer 16 olduğu için değişiklik olmaz.
4-[2,6,16,18,22,27]
```
---

* Dördünü adım aynı zamanda Insertion Sort sıralaması için yapılan son adımdır. Çünkü son iki indis sıralı bir şekilde doğru olarak dizilmiştir, dolayısıyla işlem yapmaya gerek yoktur.
```
1-[2,27,16,22,18,6]
2-[2,6,16,22,18,27]
3-[2,6,16,22,18,27] -->En küçük değer 16 olduğu için değişiklik olmaz.
4-[2,6,16,18,22,27]
5-[2,6,16,18,22,27] -->En küçük değer 22 olduğu için değişiklik olmaz.

```
    
---
### 2. Big-O gösterimi

Büyük O, bir fonksiyonun asimptotik üst sınırı olarak tanımlanır.Bunun bir fonksiyonun alabileceği maksimum değerleri kapsayan bir fonksiyon olduğu anlamına gelir. Bu gösterim performansı tahmin etmemize ve algoritmaları karşılaştırmamıza yardımcı olur. 

```
n+(n-1)+(n-2)+...+1'den Big-O gösterimi O(n^2) olur.
```

---
### 3. Insertion Sort Zaman Karmaşıklığı hesaplaması 

Best Case: Dizinin tamamen sıralı şekilde olmasıdır. O(n) 

Worst Case: Dizinin baştan sonra ters sıralı bir şekilde olmasıdır. O(n^2) 

Average Case: Dizinin sıralamasının O(n^2)

---
### 4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer?

Average case kapsamında değerlendirilir.

---



## **2. Soruda verilen dizinin Insertion Sort arama algoritmasına göre ilk 4 adımı**

* Soruda verilen dizinin ilk hali
```
[7,3,5,8,2,9,4,15,6]
```
-----
* Birinci adımda Insertion sort dizinin en düşük değeri olan beşinci indisteki iki değeri ile ilk indisteki yedi değeri yer değiştirir.

```
1-[7,3,5,8,2,9,4,15,6]
2-[2,3,5,8,7,9,4,15,6]
```
-----
* İkinci adımda dizinin ikinci indisindeki üç değeri dizideki en küçük ikinci değer olduğu için bir değişiklik yapılmaz.

```
1-[7,3,5,8,2,9,4,15,6]
2-[2,3,5,8,7,9,4,15,6] --> En küçük değer 3 olduğu için değişiklik olmaz.
```
-----
* Üçüncü adımda dizinin yedinci indisindeki dört değeri ile üçüncü indisteki beş değeri yer değiştirir.

```
1-[7,3,5,8,2,9,4,15,6]
2-[2,3,5,8,7,9,4,15,6]
3-[2,3,4,8,7,9,5,15,6]
```
-----
* Dördüncü adımda dizinin yedinci indisindeki beş değeri ile dördüncü indisindeki sekiz değeri yer değiştirir.

```
1-[7,3,5,8,2,9,4,15,6]
2-[2,3,5,8,7,9,4,15,6]
3-[2,3,4,8,7,9,5,15,6]
4-[2,3,4,5,7,9,8,15,6]
```
-----


### Kaynakça
[Geeksforgeeks](https://www.geeksforgeeks.org/insertion-sort/)

[KhanAcademy](https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/analysis-of-insertion-sort)










