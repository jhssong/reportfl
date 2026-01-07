{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/LRUMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LRUMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractLinkedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.BoundedMap\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 60,
      "end_line": 522,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation with a fixed maximum size which removes\n * the least recently used entry if an entry is added when full.\n * \u003cp\u003e\n * The least recently used algorithm works on the get and put operations only.\n * Iteration of any kind, including setting the value by iteration, does not\n * change the order. Queries such as containsKey and containsValue or access\n * via views also do not change the order.\n * \u003cp\u003e\n * A somewhat subtle ramification of the least recently used\n * algorithm is that calls to {@link #get(Object)} stand a very good chance\n * of modifying the map\u0027s iteration order and thus invalidating any\n * iterators currently in use.  It is therefore suggested that iterations\n * over an {@link LRUMap} instance access entry values only through a\n * {@link org.apache.commons.collections4.MapIterator MapIterator} or {@link #entrySet()} iterator.\n * \u003cp\u003e\n * The map implements \u003ccode\u003eOrderedMap\u003c/code\u003e and entries may be queried using\n * the bidirectional \u003ccode\u003eOrderedMapIterator\u003c/code\u003e. The order returned is\n * least recently used to most recently used. Iterators from map views can\n * also be cast to \u003ccode\u003eOrderedIterator\u003c/code\u003e if required.\n * \u003cp\u003e\n * All the available iterators can be reset back to the start by casting to\n * \u003ccode\u003eResettableIterator\u003c/code\u003e and calling \u003ccode\u003ereset()\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that LRUMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * \u003ccode\u003eNullPointerException\u003c/code\u003e\u0027s when accessed by concurrent threads.\n *\n * @since 3.0 (previously in main package v1.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Serialisation version "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_SIZE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Default maximum size "
    },
    {
      "type": "field",
      "varNames": [
        "maxSize"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Maximum size "
    },
    {
      "type": "field",
      "varNames": [
        "scanUntilRemovable"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Scan behaviour "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructs a new empty map with a maximum size of 100.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Constructs a new, empty map with the specified maximum size.\n     *\n     * @param maxSize  the maximum size of the map\n     * @throws IllegalArgumentException if the maximum size is less than one\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int, int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Constructs a new, empty map with the specified maximum size.\n     *\n     * @param maxSize  the maximum size of the map\n     * @param initialSize  the initial size of the map\n     * @throws IllegalArgumentException if the maximum size is less than one\n     * @throws IllegalArgumentException if the initial size is negative or larger than the maximum size\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int, boolean)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Constructs a new, empty map with the specified maximum size.\n     *\n     * @param maxSize  the maximum size of the map\n     * @param scanUntilRemovable  scan until a removeable entry is found, default false\n     * @throws IllegalArgumentException if the maximum size is less than one\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int, float)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Constructs a new, empty map with the specified max capacity and\n     * load factor.\n     *\n     * @param maxSize  the maximum size of the map\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the maximum size is less than one\n     * @throws IllegalArgumentException if the load factor is less than zero\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int, int, float)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Constructs a new, empty map with the specified max / initial capacity and\n     * load factor.\n     *\n     * @param maxSize  the maximum size of the map\n     * @param initialSize  the initial size of the map\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the maximum size is less than one\n     * @throws IllegalArgumentException if the initial size is negative or larger than the maximum size\n     * @throws IllegalArgumentException if the load factor is less than zero\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int, float, boolean)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Constructs a new, empty map with the specified max capacity and load factor.\n     *\n     * @param maxSize  the maximum size of the map\n     * @param loadFactor  the load factor\n     * @param scanUntilRemovable  scan until a removeable entry is found, default false\n     * @throws IllegalArgumentException if the maximum size is less than one\n     * @throws IllegalArgumentException if the load factor is less than zero\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(int, int, float, boolean)",
      "begin_line": 170,
      "end_line": 184,
      "comment": "\n     * Constructs a new, empty map with the specified max / initial capacity and load factor.\n     *\n     * @param maxSize  the maximum size of the map\n     * @param initialSize  the initial size of the map\n     * @param loadFactor  the load factor\n     * @param scanUntilRemovable  scan until a removeable entry is found, default false\n     * @throws IllegalArgumentException if the maximum size is less than one\n     * @throws IllegalArgumentException if the initial size is negative or larger than the maximum size\n     * @throws IllegalArgumentException if the load factor is less than zero\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 39)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 183,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Constructor copying elements from another map.\n     * \u003cp\u003e\n     * The maximum size is set from the map\u0027s size.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if the map is empty\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LRUMap.LRUMap(java.util.Map\u003c? extends K, ? extends V\u003e, boolean)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Constructor copying elements from another map.\n     * \u003cp/\u003e\n     * The maximum size is set from the map\u0027s size.\n     *\n     * @param map  the map to copy\n     * @param scanUntilRemovable  scan until a removeable entry is found, default false\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if the map is empty\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 66)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.get(java.lang.Object)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Gets the value mapped to the key specified.\n     * \u003cp\u003e\n     * This operation changes the position of the key in the map to the\n     * most recently used position (last).\n     *\n     * @param key  the key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.get(java.lang.Object, boolean)",
      "begin_line": 243,
      "end_line": 252,
      "comment": "\n     * Gets the value mapped to the key specified.\n     * \u003cp\u003e\n     * If {@code updateToMRU} is {@code true}, the position of the key in the map\n     * is changed to the most recently used position (last), otherwise the iteration\n     * order is not changed by this operation.\n     *\n     * @param key  the key\n     * @param updateToMRU  whether the key shall be updated to the\n     *   most recently used position\n     * @return the mapped value, null if no match\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.moveToMRU(org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry\u003cK, V\u003e)",
      "begin_line": 262,
      "end_line": 282,
      "comment": "\n     * Moves an entry to the MRU position at the end of the list.\n     * \u003cp\u003e\n     * This implementation moves the updated entry to the end of the list.\n     *\n     * @param entry  the entry to update\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.updateEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, V)",
      "begin_line": 293,
      "end_line": 297,
      "comment": "\n     * Updates an existing key-value mapping.\n     * \u003cp\u003e\n     * This implementation moves the updated entry to the end of the list\n     * using {@link #moveToMRU(AbstractLinkedMap.LinkEntry)}.\n     *\n     * @param entry  the entry to update\n     * @param newValue  the new value to store\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 43)",
        "(line 296,col 9)-(line 296,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.addMapping(int, int, K, V)",
      "begin_line": 314,
      "end_line": 353,
      "comment": "\n     * Adds a new key-value mapping into this map.\n     * \u003cp\u003e\n     * This implementation checks the LRU size and determines whether to\n     * discard an entry or not using {@link #removeLRU(AbstractLinkedMap.LinkEntry)}.\n     * \u003cp\u003e\n     * From Commons Collections 3.1 this method uses {@link #isFull()} rather\n     * than accessing \u003ccode\u003esize\u003c/code\u003e and \u003ccode\u003emaxSize\u003c/code\u003e directly.\n     * It also handles the scanUntilRemovable functionality.\n     *\n     * @param hashIndex  the index into the data array to store at\n     * @param hashCode  the hash code of the key to add\n     * @param key  the key to add\n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.reuseMapping(org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry\u003cK, V\u003e, int, int, K, V)",
      "begin_line": 366,
      "end_line": 400,
      "comment": "\n     * Reuses an entry by removing it and moving it to a new place in the map.\n     * \u003cp\u003e\n     * This method uses {@link #removeEntry}, {@link #reuseEntry} and {@link #addEntry}.\n     *\n     * @param entry  the entry to reuse\n     * @param hashIndex  the index into the data array to store at\n     * @param hashCode  the hash code of the key to add\n     * @param key  the key to add\n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.removeLRU(org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry\u003cK, V\u003e)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * Subclass method to control removal of the least recently used entry from the map.\n     * \u003cp\u003e\n     * This method exists for subclasses to override. A subclass may wish to\n     * provide cleanup of resources when an entry is removed. For example:\n     * \u003cpre\u003e\n     * protected boolean removeLRU(LinkEntry entry) {\n     *   releaseResources(entry.getValue());  // release resources held by entry\n     *   return true;  // actually delete entry\n     * }\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Alternatively, a subclass may choose to not remove the entry or selectively\n     * keep certain LRU entries. For example:\n     * \u003cpre\u003e\n     * protected boolean removeLRU(LinkEntry entry) {\n     *   if (entry.getKey().toString().startsWith(\"System.\")) {\n     *     return false;  // entry not removed from LRUMap\n     *   } else {\n     *     return true;  // actually delete entry\n     *   }\n     * }\n     * \u003c/pre\u003e\n     * The effect of returning false is dependent on the scanUntilRemovable flag.\n     * If the flag is true, the next LRU entry will be passed to this method and so on\n     * until one returns false and is removed, or every entry in the map has been passed.\n     * If the scanUntilRemovable flag is false, the map will exceed the maximum size.\n     * \u003cp\u003e\n     * NOTE: Commons Collections 3.0 passed the wrong entry to this method.\n     * This is fixed in version 3.1 onwards.\n     *\n     * @param entry  the entry to be removed\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.isFull()",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n     * Returns true if this map is full and no new mappings can be added.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the map is full\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.maxSize()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Gets the maximum size of the map (the bound).\n     *\n     * @return the maximum number of elements the map can hold\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.isScanUntilRemovable()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Whether this LRUMap will scan until a removable entry is found when the\n     * map is full.\n     *\n     * @return true if this map scans\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.clone()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 33)",
        "(line 486,col 9)-(line 486,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 492,
      "end_line": 495,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 31)",
        "(line 494,col 9)-(line 494,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 503,
      "end_line": 507,
      "comment": "\n     * Writes the data necessary for \u003ccode\u003eput()\u003c/code\u003e to work in deserialization.\n     *\n     * @param out  the output stream\n     * @throws IOException if an error occurs while writing to the stream\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 30)",
        "(line 506,col 9)-(line 506,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LRUMap.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 516,
      "end_line": 520,
      "comment": "\n     * Reads the data necessary for \u003ccode\u003eput()\u003c/code\u003e to work in the superclass.\n     *\n     * @param in  the input stream\n     * @throws IOException if an error occurs while reading from the stream\n     * @throws ClassNotFoundException if an object read from the stream can not be loaded\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 31)",
        "(line 519,col 9)-(line 519,col 31)"
      ]
    }
  ]
}