{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/EnumUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 117,
      "comment": "\n * \u003cp\u003eUtility library to provide helper methods for Java enums.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.EnumUtils.EnumUtils()",
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * This constructor is public to permit tools that require a JavaBean\n     * instance to operate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumMap(java.lang.Class\u003cE\u003e)",
      "begin_line": 51,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eGets the {@code Map} of enums by name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is useful when you need a map of enums by name.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @return the modifiable map of enum names to enums, never null\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 60)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumList(java.lang.Class\u003cE\u003e)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * \u003cp\u003eGets the {@code List} of enums.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is useful when you need a list of enums rather than an array.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @return the modifiable list of enums, never null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.isValidEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 83,
      "end_line": 93,
      "comment": "\n     * \u003cp\u003eChecks if the specified name is a valid enum for the class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method differs from {@link Enum#valueOf} in that checks if the name is\n     * a valid enum without needing to catch the exception.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @param enumName   the enum name, null returns false\n     * @return true if the enum name is valid, otherwise false\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 106,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eGets the enum for the class, returning {@code null} if not found.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method differs from {@link Enum#valueOf} in that it does not throw an exception\n     * for an invalid enum name.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @param enumName   the enum name, null returns null\n     * @return the enum, null if not found\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 114,col 9)"
      ]
    }
  ]
}