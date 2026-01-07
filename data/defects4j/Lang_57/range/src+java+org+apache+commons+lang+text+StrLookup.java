{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/text/StrLookup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrLookup",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 161,
      "comment": "\n * Lookup a String key to a String value.\n * \u003cp\u003e\n * This class represents the simplest form of a string to string map.\n * It has a benefit over a map in that it can create the result on\n * demand based on the key.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n * \u003cp\u003e\n * For example, it would be possible to implement a lookup that used the\n * key as a primary key, and looked up the value on demand from the database\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NONE_LOOKUP"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Lookup that always returns null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SYSTEM_PROPERTIES_LOOKUP"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Lookup that uses System properties.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrLookup.noneLookup()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Returns a lookup which always returns null.\n     *\n     * @return a lookup that always returns null, not null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrLookup.systemPropertiesLookup()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns a lookup which uses {@link System#getProperties() System properties}\n     * to lookup the key to value.\n     * \u003cp\u003e\n     * If a security manager blocked access to system properties, then null will\n     * be returned from every lookup.\n     * \u003cp\u003e\n     * If a null key is used, this lookup will throw a NullPointerException.\n     *\n     * @return a lookup using system properties, not null\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrLookup.mapLookup(java.util.Map)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Returns a lookup which looks up values using a map.\n     * \u003cp\u003e\n     * If the map is null, then null will be returned from every lookup.\n     * The map result object is converted to a string using toString().\n     *\n     * @param map  the map of keys to values, may be null\n     * @return a lookup using the map, not null\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrLookup.StrLookup()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrLookup.lookup(java.lang.String)",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Looks up a String key to a String value.\n     * \u003cp\u003e\n     * The internal implementation may use any mechanism to return the value.\n     * The simplest implementation is to use a Map. However, virtually any\n     * implementation is possible.\n     * \u003cp\u003e\n     * For example, it would be possible to implement a lookup that used the\n     * key as a primary key, and looked up the value on demand from the database\n     * Or, a numeric based implementation could be created that treats the key\n     * as an integer, increments the value and return the result as a string -\n     * converting 1 to 2, 15 to 16 etc.\n     *\n     * @param key  the key to be looked up, may be null\n     * @return the matching value, null if no match\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MapStrLookup",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrLookup"
      ],
      "begin_line": 127,
      "end_line": 160,
      "comment": "\n     * Lookup imnplementation that uses a Map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Map keys are variable names and value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrLookup.MapStrLookup.MapStrLookup(java.util.Map)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n         * Creates a new instance backed by a Map.\n         *\n         * @param map  the map of keys to values, may be null\n         ",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrLookup.MapStrLookup.lookup(java.lang.String)",
      "begin_line": 150,
      "end_line": 159,
      "comment": "\n         * Looks up a String key to a String value using the map.\n         * \u003cp\u003e\n         * If the map is null, then null is returned.\n         * The map result object is converted to a string using toString().\n         *\n         * @param key  the key to be looked up, may be null\n         * @return the matching value, null if no match\n         ",
      "child_ranges": [
        "(line 151,col 13)-(line 153,col 13)",
        "(line 154,col 13)-(line 154,col 38)",
        "(line 155,col 13)-(line 157,col 13)",
        "(line 158,col 13)-(line 158,col 34)"
      ]
    }
  ]
}