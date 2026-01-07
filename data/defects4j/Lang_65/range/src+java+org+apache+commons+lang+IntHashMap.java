{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/IntHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntHashMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 363,
      "comment": "\n * \u003cp\u003eA hash map that uses primitive ints for the key rather than objects.\u003c/p\u003e\n *\n * \u003cp\u003eNote that this class is for internal optimization purposes only, and may\n * not be supported in future releases of Jakarta Commons Lang.  Utilities of\n * this sort may be included in future releases of Jakarta Commons Collections.\u003c/p\u003e\n *\n * @author Justin Couch\n * @author Alex Chaffee (alex@apache.org)\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Revision$\n * @see java.util.HashMap\n "
    },
    {
      "type": "field",
      "varNames": [
        "table"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The hash table data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The total number of entries in the hash table.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The table is rehashed when its size exceeds this threshold.  (The\n     * value of this field is (int)(capacity * loadFactor).)\n     *\n     * @serial\n     "
    },
    {
      "type": "field",
      "varNames": [
        "loadFactor"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The load factor for the hashtable.\n     *\n     * @serial\n     "
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003eInnerclass that acts as a datastructure to create a new entry in the\n     * table.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hash"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.Entry.Entry(int, int, java.lang.Object, org.apache.commons.lang.IntHashMap.Entry)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n         * \u003cp\u003eCreate a new entry with the given values.\u003c/p\u003e\n         *\n         * @param hash The code used to hash the object with\n         * @param key The key used to enter this in the table\n         * @param value The value for this key\n         * @param next A reference to the next entry in the table\n         ",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 29)",
        "(line 84,col 13)-(line 84,col 27)",
        "(line 85,col 13)-(line 85,col 31)",
        "(line 86,col 13)-(line 86,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.IntHashMap()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eConstructs a new, empty hashtable with a default capacity and load\n     * factor, which is \u003ccode\u003e20\u003c/code\u003e and \u003ccode\u003e0.75\u003c/code\u003e respectively.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.IntHashMap(int)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003eConstructs a new, empty hashtable with the specified initial capacity\n     * and default load factor, which is \u003ccode\u003e0.75\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param  initialCapacity the initial capacity of the hashtable.\n     * @throws IllegalArgumentException if the initial capacity is less\n     *   than zero.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.IntHashMap(int, float)",
      "begin_line": 119,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eConstructs a new, empty hashtable with the specified initial\n     * capacity and the specified load factor.\u003c/p\u003e\n     *\n     * @param initialCapacity the initial capacity of the hashtable.\n     * @param loadFactor the load factor of the hashtable.\n     * @throws IllegalArgumentException  if the initial capacity is less\n     *             than zero, or if the load factor is nonpositive.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 16)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 37)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 133,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.size()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eReturns the number of keys in this hashtable.\u003c/p\u003e\n     *\n     * @return  the number of keys in this hashtable.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.isEmpty()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eTests if this hashtable maps no keys to values.\u003c/p\u003e\n     *\n     * @return  \u003ccode\u003etrue\u003c/code\u003e if this hashtable maps no keys to values;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.contains(java.lang.Object)",
      "begin_line": 173,
      "end_line": 187,
      "comment": "\n     * \u003cp\u003eTests if some key maps into the specified value in this hashtable.\n     * This operation is more expensive than the \u003ccode\u003econtainsKey\u003c/code\u003e\n     * method.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that this method is identical in functionality to containsValue,\n     * (which is part of the Map interface in the collections framework).\u003c/p\u003e\n     *\n     * @param      value   a value to search for.\n     * @return     \u003ccode\u003etrue\u003c/code\u003e if and only if some key maps to the\n     *             \u003ccode\u003evalue\u003c/code\u003e argument in this hashtable as\n     *             determined by the \u003ctt\u003eequals\u003c/tt\u003e method;\n     *             \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @throws  NullPointerException  if the value is \u003ccode\u003enull\u003c/code\u003e.\n     * @see        #containsKey(int)\n     * @see        #containsValue(Object)\n     * @see        java.util.Map\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.containsValue(java.lang.Object)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if this HashMap maps one or more keys\n     * to this value.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that this method is identical in functionality to contains\n     * (which predates the Map interface).\u003c/p\u003e\n     *\n     * @param value value whose presence in this HashMap is to be tested.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the value is contained\n     * @see    java.util.Map\n     * @since JDK1.2\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.containsKey(int)",
      "begin_line": 214,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eTests if the specified object is a key in this hashtable.\u003c/p\u003e\n     *\n     * @param  key  possible key.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if and only if the specified object is a\n     *    key in this hashtable, as determined by the \u003ctt\u003eequals\u003c/tt\u003e\n     *    method; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see #contains(Object)\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 28)",
        "(line 216,col 9)-(line 216,col 23)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.get(int)",
      "begin_line": 235,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003eReturns the value to which the specified key is mapped in this map.\u003c/p\u003e\n     *\n     * @param   key   a key in the hashtable.\n     * @return  the value to which the key is mapped in this hashtable;\n     *          \u003ccode\u003enull\u003c/code\u003e if the key is not mapped to any value in\n     *          this hashtable.\n     * @see     #put(int, Object)\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 28)",
        "(line 237,col 9)-(line 237,col 23)",
        "(line 238,col 9)-(line 238,col 53)",
        "(line 239,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.rehash()",
      "begin_line": 256,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eIncreases the capacity of and internally reorganizes this\n     * hashtable, in order to accommodate and access its entries more\n     * efficiently.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is called automatically when the number of keys\n     * in the hashtable exceeds this hashtable\u0027s capacity and load\n     * factor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 39)",
        "(line 258,col 9)-(line 258,col 31)",
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 261,col 48)",
        "(line 263,col 9)-(line 263,col 53)",
        "(line 264,col 9)-(line 264,col 23)",
        "(line 266,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.put(int, java.lang.Object)",
      "begin_line": 293,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eMaps the specified \u003ccode\u003ekey\u003c/code\u003e to the specified\n     * \u003ccode\u003evalue\u003c/code\u003e in this hashtable. The key cannot be\n     * \u003ccode\u003enull\u003c/code\u003e. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe value can be retrieved by calling the \u003ccode\u003eget\u003c/code\u003e method\n     * with a key that is equal to the original key.\u003c/p\u003e\n     *\n     * @param key     the hashtable key.\n     * @param value   the value.\n     * @return the previous value of the specified key in this hashtable,\n     *         or \u003ccode\u003enull\u003c/code\u003e if it did not have one.\n     * @throws  NullPointerException  if the key is \u003ccode\u003enull\u003c/code\u003e.\n     * @see     #get(int)\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 28)",
        "(line 296,col 9)-(line 296,col 23)",
        "(line 297,col 9)-(line 297,col 53)",
        "(line 298,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 312,col 9)",
        "(line 315,col 9)-(line 315,col 58)",
        "(line 316,col 9)-(line 316,col 23)",
        "(line 317,col 9)-(line 317,col 16)",
        "(line 318,col 9)-(line 318,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.remove(int)",
      "begin_line": 332,
      "end_line": 350,
      "comment": "\n     * \u003cp\u003eRemoves the key (and its corresponding value) from this\n     * hashtable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing if the key is not present in the\n     * hashtable.\u003c/p\u003e\n     *\n     * @param   key   the key that needs to be removed.\n     * @return  the value to which the key had been mapped in this hashtable,\n     *          or \u003ccode\u003enull\u003c/code\u003e if the key did not have a mapping.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 28)",
        "(line 334,col 9)-(line 334,col 23)",
        "(line 335,col 9)-(line 335,col 53)",
        "(line 336,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.clear()",
      "begin_line": 355,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003eClears this hashtable so that it contains no keys.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 28)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 18)"
      ]
    }
  ]
}