import java.util.Arrays; // Массивы

public class ArrayStorage
    {
        Resume[] storage = new Resume[10000];
            int size = 0;

    void clear() { // Чистка
        Arrays.fill(storage, 0, size, null);
            size = 0;
    }

    void save(Resume resume)
    {
        if (size < storage.length)
        {
            storage[size] = resume;
                size++;
        }
    }

    Resume get(String uuid)
    {
        for (int i=0;i<size;i++){
            if(storage[i].uuid==uuid)
            {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid)
    {

    }

        Resume[] getAll()
        {
            return new Resume[0]; //Возвращаем выражение Если не указано, то вместо него возвращается undefined.
    }

                int size()
                {
                     return 0;
                }
}