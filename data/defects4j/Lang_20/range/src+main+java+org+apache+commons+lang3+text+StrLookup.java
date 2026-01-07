{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/StrLookup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrLookup",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 172,
      "comment": "\n * Lookup a String key to a String value.\n * \u003cp\u003e\n * This class represents the simplest form of a string to string map.\n * It has a benefit over a map in that it can create the result on\n * demand based on the key.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n * \u003cp\u003e\n * For example, it would be possible to implement a lookup that used the\n * key as a primary key, and looked up the value on demand from the database\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NONE_LOOKUP"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Lookup that always returns null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SYSTEM_PROPERTIES_LOOKUP"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Lookup that uses System properties.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrLookup.noneLookup()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Returns a lookup which always returns null.\n     *\n     * @return a lookup that always returns null, not null\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrLookup.systemPropertiesLookup()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Returns a lookup which uses {@link System#getProperties() System properties}\n     * to lookup the key to value.\n     * \u003cp\u003e\n     * If a security manager blocked access to system properties, then null will\n     * be returned from every lookup.\n     * \u003cp\u003e\n     * If a null key is used, this lookup will throw a NullPointerException.\n     *\n     * @return a lookup using system properties, not null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrLookup.mapLookup(java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns a lookup which looks up values using a map.\n     * \u003cp\u003e\n     * If the map is null, then null will be returned from every lookup.\n     * The map result object is converted to a string using toString().\n     *\n     * @param \u003cV\u003e the type of the values supported by the lookup\n     * @param map  the map of keys to values, may be null\n     * @return a lookup using the map, not null\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrLookup.StrLookup()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrLookup.lookup(java.lang.String)",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Looks up a String key to a String value.\n     * \u003cp\u003e\n     * The internal implementation may use any mechanism to return the value.\n     * The simplest implementation is to use a Map. However, virtually any\n     * implementation is possible.\n     * \u003cp\u003e\n     * For example, it would be possible to implement a lookup that used the\n     * key as a primary key, and looked up the value on demand from the database\n     * Or, a numeric based implementation could be created that treats the key\n     * as an integer, increments the value and return the result as a string -\n     * converting 1 to 2, 15 to 16 etc.\n     * \u003cp\u003e\n     * The {@link #lookup(String)} method always returns a String, regardless of\n     * the underlying data, by converting it as necessary. For example:\n     * \u003cpre\u003e\n     * Map\u003cString, Object\u003e map \u003d new HashMap\u003cString, Object\u003e();\n     * map.put(\"number\", new Integer(2));\n     * assertEquals(\"2\", StrLookup.mapLookup(map).lookup(\"number\"));\n     * \u003c/pre\u003e\n     * @param key  the key to be looked up, may be null\n     * @return the matching value, null if no match\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MapStrLookup",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrLookup\u003cV\u003e"
      ],
      "begin_line": 137,
      "end_line": 171,
      "comment": "\n     * Lookup implementation that uses a Map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Map keys are variable names and value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrLookup.MapStrLookup.MapStrLookup(java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n         * Creates a new instance backed by a Map.\n         *\n         * @param map  the map of keys to values, may be null\n         ",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrLookup.MapStrLookup.lookup(java.lang.String)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n         * Looks up a String key to a String value using the map.\n         * \u003cp\u003e\n         * If the map is null, then null is returned.\n         * The map result object is converted to a string using toString().\n         *\n         * @param key  the key to be looked up, may be null\n         * @return the matching value, null if no match\n         ",
      "child_ranges": [
        "(line 162,col 13)-(line 164,col 13)",
        "(line 165,col 13)-(line 165,col 38)",
        "(line 166,col 13)-(line 168,col 13)",
        "(line 169,col 13)-(line 169,col 34)"
      ]
    }
  ]
}