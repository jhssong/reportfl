{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/IntHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntHashMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 364,
      "comment": "\n * \u003cp\u003eA hash map that uses primitive ints for the key rather than objects.\u003c/p\u003e\n *\n * \u003cp\u003eNote that this class is for internal optimization purposes only, and may\n * not be supported in future releases of Jakarta Commons Lang.  Utilities of\n * this sort may be included in future releases of Jakarta Commons Collections.\u003c/p\u003e\n *\n * @author Justin Couch\n * @author Alex Chaffee (alex@apache.org)\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Revision$\n * @see java.util.HashMap\n "
    },
    {
      "type": "field",
      "varNames": [
        "table"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The hash table data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The total number of entries in the hash table.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The table is rehashed when its size exceeds this threshold.  (The\n     * value of this field is (int)(capacity * loadFactor).)\n     *\n     * @serial\n     "
    },
    {
      "type": "field",
      "varNames": [
        "loadFactor"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * The load factor for the hashtable.\n     *\n     * @serial\n     "
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eInnerclass that acts as a datastructure to create a new entry in the\n     * table.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hash"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.Entry.Entry(int, int, java.lang.Object, org.apache.commons.lang.IntHashMap.Entry)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n         * \u003cp\u003eCreate a new entry with the given values.\u003c/p\u003e\n         *\n         * @param hash The code used to hash the object with\n         * @param key The key used to enter this in the table\n         * @param value The value for this key\n         * @param next A reference to the next entry in the table\n         ",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 29)",
        "(line 85,col 13)-(line 85,col 27)",
        "(line 86,col 13)-(line 86,col 31)",
        "(line 87,col 13)-(line 87,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.IntHashMap()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eConstructs a new, empty hashtable with a default capacity and load\n     * factor, which is \u003ccode\u003e20\u003c/code\u003e and \u003ccode\u003e0.75\u003c/code\u003e respectively.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.IntHashMap(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eConstructs a new, empty hashtable with the specified initial capacity\n     * and default load factor, which is \u003ccode\u003e0.75\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param  initialCapacity the initial capacity of the hashtable.\n     * @throws IllegalArgumentException if the initial capacity is less\n     *   than zero.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.IntHashMap.IntHashMap(int, float)",
      "begin_line": 120,
      "end_line": 135,
      "comment": "\n     * \u003cp\u003eConstructs a new, empty hashtable with the specified initial\n     * capacity and the specified load factor.\u003c/p\u003e\n     *\n     * @param initialCapacity the initial capacity of the hashtable.\n     * @param loadFactor the load factor of the hashtable.\n     * @throws IllegalArgumentException  if the initial capacity is less\n     *             than zero, or if the load factor is nonpositive.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 16)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 37)",
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 134,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.size()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eReturns the number of keys in this hashtable.\u003c/p\u003e\n     *\n     * @return  the number of keys in this hashtable.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.isEmpty()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eTests if this hashtable maps no keys to values.\u003c/p\u003e\n     *\n     * @return  \u003ccode\u003etrue\u003c/code\u003e if this hashtable maps no keys to values;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.contains(java.lang.Object)",
      "begin_line": 174,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eTests if some key maps into the specified value in this hashtable.\n     * This operation is more expensive than the \u003ccode\u003econtainsKey\u003c/code\u003e\n     * method.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that this method is identical in functionality to containsValue,\n     * (which is part of the Map interface in the collections framework).\u003c/p\u003e\n     *\n     * @param      value   a value to search for.\n     * @return     \u003ccode\u003etrue\u003c/code\u003e if and only if some key maps to the\n     *             \u003ccode\u003evalue\u003c/code\u003e argument in this hashtable as\n     *             determined by the \u003ctt\u003eequals\u003c/tt\u003e method;\n     *             \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @throws  NullPointerException  if the value is \u003ccode\u003enull\u003c/code\u003e.\n     * @see        #containsKey(int)\n     * @see        #containsValue(Object)\n     * @see        java.util.Map\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 28)",
        "(line 180,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.containsValue(java.lang.Object)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if this HashMap maps one or more keys\n     * to this value.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that this method is identical in functionality to contains\n     * (which predates the Map interface).\u003c/p\u003e\n     *\n     * @param value value whose presence in this HashMap is to be tested.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the value is contained\n     * @see    java.util.Map\n     * @since JDK1.2\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.containsKey(int)",
      "begin_line": 215,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eTests if the specified object is a key in this hashtable.\u003c/p\u003e\n     *\n     * @param  key  possible key.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if and only if the specified object is a\n     *    key in this hashtable, as determined by the \u003ctt\u003eequals\u003c/tt\u003e\n     *    method; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see #contains(Object)\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 28)",
        "(line 217,col 9)-(line 217,col 23)",
        "(line 218,col 9)-(line 218,col 53)",
        "(line 219,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.get(int)",
      "begin_line": 236,
      "end_line": 246,
      "comment": "\n     * \u003cp\u003eReturns the value to which the specified key is mapped in this map.\u003c/p\u003e\n     *\n     * @param   key   a key in the hashtable.\n     * @return  the value to which the key is mapped in this hashtable;\n     *          \u003ccode\u003enull\u003c/code\u003e if the key is not mapped to any value in\n     *          this hashtable.\n     * @see     #put(int, Object)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 28)",
        "(line 238,col 9)-(line 238,col 23)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.rehash()",
      "begin_line": 257,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eIncreases the capacity of and internally reorganizes this\n     * hashtable, in order to accommodate and access its entries more\n     * efficiently.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is called automatically when the number of keys\n     * in the hashtable exceeds this hashtable\u0027s capacity and load\n     * factor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 31)",
        "(line 261,col 9)-(line 261,col 46)",
        "(line 262,col 9)-(line 262,col 48)",
        "(line 264,col 9)-(line 264,col 53)",
        "(line 265,col 9)-(line 265,col 23)",
        "(line 267,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.put(int, java.lang.Object)",
      "begin_line": 294,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eMaps the specified \u003ccode\u003ekey\u003c/code\u003e to the specified\n     * \u003ccode\u003evalue\u003c/code\u003e in this hashtable. The key cannot be\n     * \u003ccode\u003enull\u003c/code\u003e. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe value can be retrieved by calling the \u003ccode\u003eget\u003c/code\u003e method\n     * with a key that is equal to the original key.\u003c/p\u003e\n     *\n     * @param key     the hashtable key.\n     * @param value   the value.\n     * @return the previous value of the specified key in this hashtable,\n     *         or \u003ccode\u003enull\u003c/code\u003e if it did not have one.\n     * @throws  NullPointerException  if the key is \u003ccode\u003enull\u003c/code\u003e.\n     * @see     #get(int)\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 28)",
        "(line 297,col 9)-(line 297,col 23)",
        "(line 298,col 9)-(line 298,col 53)",
        "(line 299,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 313,col 9)",
        "(line 316,col 9)-(line 316,col 58)",
        "(line 317,col 9)-(line 317,col 23)",
        "(line 318,col 9)-(line 318,col 16)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.remove(int)",
      "begin_line": 333,
      "end_line": 351,
      "comment": "\n     * \u003cp\u003eRemoves the key (and its corresponding value) from this\n     * hashtable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing if the key is not present in the\n     * hashtable.\u003c/p\u003e\n     *\n     * @param   key   the key that needs to be removed.\n     * @return  the value to which the key had been mapped in this hashtable,\n     *          or \u003ccode\u003enull\u003c/code\u003e if the key did not have a mapping.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 28)",
        "(line 335,col 9)-(line 335,col 23)",
        "(line 336,col 9)-(line 336,col 53)",
        "(line 337,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.IntHashMap.clear()",
      "begin_line": 356,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eClears this hashtable so that it contains no keys.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 28)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 18)"
      ]
    }
  ]
}