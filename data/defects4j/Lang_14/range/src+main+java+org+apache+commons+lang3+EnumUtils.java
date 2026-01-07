{
  "filepath": "/tmp/Lang-14b/src/main/java/org/apache/commons/lang3/EnumUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 208,
      "comment": "\n * \u003cp\u003eUtility library to provide helper methods for Java enums.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.EnumUtils.EnumUtils()",
      "begin_line": 40,
      "end_line": 41,
      "comment": "\n     * This constructor is public to permit tools that require a JavaBean\n     * instance to operate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumMap(java.lang.Class\u003cE\u003e)",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eGets the {@code Map} of enums by name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is useful when you need a map of enums by name.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @return the modifiable map of enum names to enums, never null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 60)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumList(java.lang.Class\u003cE\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * \u003cp\u003eGets the {@code List} of enums.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is useful when you need a list of enums rather than an array.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @return the modifiable list of enums, never null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.isValidEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 84,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003eChecks if the specified name is a valid enum for the class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method differs from {@link Enum#valueOf} in that checks if the name is\n     * a valid enum without needing to catch the exception.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @param enumName   the enum name, null returns false\n     * @return true if the enum name is valid, otherwise false\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eGets the enum for the class, returning {@code null} if not found.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method differs from {@link Enum#valueOf} in that it does not throw an exception\n     * for an invalid enum name.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass  the class of the enum to query, not null\n     * @param enumName   the enum name, null returns null\n     * @return the enum, null if not found\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.generateBitVector(java.lang.Class\u003cE\u003e, java.lang.Iterable\u003cE\u003e)",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eCreates a long bit vector representation of the given subset of an Enum.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis generates a value that is usable by {@link EnumUtils#processBitVector}.\u003c/p\u003e\n     *\n     * \u003cp\u003eDo not use this method if you have more than 64 values in your Enum, as this\n     * would create a value greater than a long can hold.\u003c/p\u003e\n     *\n     * @param enumClass the class of the enum we are working with, not {@code null}\n     * @param values    the values we want to convert, not {@code null}\n     * @param \u003cE\u003e       the type of the enumeration\n     * @return a long whose binary value represents the given set of enum values.\n     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}\n     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 137,col 23)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.generateBitVector(java.lang.Class\u003cE\u003e, E...)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eCreates a long bit vector representation of the given array of Enum values.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis generates a value that is usable by {@link EnumUtils#processBitVector}.\u003c/p\u003e\n     *\n     * \u003cp\u003eDo not use this method if you have more than 64 values in your Enum, as this\n     * would create a value greater than a long can hold.\u003c/p\u003e\n     *\n     * @param enumClass the class of the enum we are working with, not {@code null}\n     * @param values    the values we want to convert, not {@code null}\n     * @param \u003cE\u003e       the type of the enumeration\n     * @return a long whose binary value represents the given set of enum values.\n     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}\n     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 40)",
        "(line 162,col 9)-(line 162,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.processBitVector(java.lang.Class\u003cE\u003e, long)",
      "begin_line": 178,
      "end_line": 187,
      "comment": "\n     * \u003cp\u003eConvert a long value created by {@link EnumUtils#generateBitVector} into the set of\n     * enum values that it represents.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf you store this value, beware any changes to the enum that would affect ordinal values.\u003c/p\u003e\n     * @param enumClass the class of the enum we are working with, not {@code null}\n     * @param value     the long value representation of a set of enum values\n     * @param \u003cE\u003e       the type of the enumeration\n     * @return a set of enum values\n     * @throws NullPointerException if {@code enumClass} is {@code null}\n     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 79)",
        "(line 180,col 9)-(line 180,col 61)",
        "(line 181,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.checkBitVectorable(java.lang.Class\u003cE\u003e)",
      "begin_line": 198,
      "end_line": 207,
      "comment": "\n     * Validate that {@code enumClass} is compatible with representation in a {@code long}.\n     * @param \u003cE\u003e the type of the enumeration\n     * @param enumClass to check\n     * @return {@code enumClass}\n     * @throws NullPointerException if {@code enumClass} is {@code null}\n     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 66)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 93)",
        "(line 203,col 9)-(line 204,col 50)",
        "(line 206,col 9)-(line 206,col 25)"
      ]
    }
  ]
}