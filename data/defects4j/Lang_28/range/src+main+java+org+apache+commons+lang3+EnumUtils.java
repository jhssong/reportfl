{
  "filepath": "/tmp/Lang-28b/src/main/java/org/apache/commons/lang3/EnumUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 105,
      "comment": "\n * Utility library to provide helper methods for Java enums.\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.EnumUtils.EnumUtils()",
      "begin_line": 37,
      "end_line": 38,
      "comment": "\n     * This constructor is public to permit tools that require a JavaBean\n     * instance to operate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumMap(java.lang.Class\u003cE\u003e)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Gets the \u003ccode\u003eMap\u003c/code\u003e of \u003ccode\u003eenums\u003c/code\u003e by name.\n     * \u003cp\u003e\n     * This method is useful when you need a map of enums by name.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @return the modifiable map of enum names to enums, never null\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 60)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumList(java.lang.Class\u003cE\u003e)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Gets the \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eenums\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method is useful when you need a list of enums rather than an array.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @return the modifiable list of enums, never null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.isValidEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 78,
      "end_line": 85,
      "comment": "\n     * Checks if the specified name is a valid \u003ccode\u003eenum\u003c/code\u003e for the class.\n     * \u003cp\u003e\n     * This method differs from {@link Enum#valueOf} in that checks if the name is\n     * a valid enum without needing to catch the exception.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @param enumName   the enum name\n     * @return true if the enum name is valid, otherwise false\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * Gets the \u003ccode\u003eenum\u003c/code\u003e for the class, returning \u003ccode\u003enull\u003c/code\u003e if not found.\n     * \u003cp\u003e\n     * This method differs from {@link Enum#valueOf} in that it does not throw an exception\n     * for an invalid enum name.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @param enumName   the enum name\n     * @return the enum or null if not found\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 9)"
      ]
    }
  ]
}