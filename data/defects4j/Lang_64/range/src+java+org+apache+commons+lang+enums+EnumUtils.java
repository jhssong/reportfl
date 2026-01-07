{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/enums/EnumUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 123,
      "comment": "\n * \u003cp\u003eUtility class for accessing and manipulating {@link Enum}s.\u003c/p\u003e\n *\n * @see Enum\n * @see ValuedEnum\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @since 2.1 (class existed in enum package from v1.0)\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.enums.EnumUtils.EnumUtils()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Public constructor. This class should not normally be instantiated.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 39,col 7)-(line 39,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.EnumUtils.getEnum(java.lang.Class, java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEnum\u003c/code\u003e object by class and name.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @param name  the name of the Enum to get, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.EnumUtils.getEnum(java.lang.Class, int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eValuedEnum\u003c/code\u003e object by class and value.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @param value  the value of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum object, or null if the enum does not exist\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.EnumUtils.getEnumMap(java.lang.Class)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eMap\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects by\n     * name using the \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eMap\u003c/code\u003e is returned. The \u003ccode\u003eMap\u003c/code\u003e is unmodifiable.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass\n     *  of \u003ccode\u003eEnum\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.EnumUtils.getEnumList(java.lang.Class)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects using\n     * the \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe list is in the order that the objects were created\n     * (source code order).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eList\u003c/code\u003e is returned. The \u003ccode\u003eList\u003c/code\u003e is unmodifiable.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the Enum to get\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass\n     *  of \u003ccode\u003eEnum\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.EnumUtils.iterator(java.lang.Class)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eIterator\u003c/code\u003e over the \u003ccode\u003eEnum\u003c/code\u003e objects\n     * in an \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe iterator is in the order that the objects were created\n     * (source code order).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eIterator\u003c/code\u003e is returned. The \u003ccode\u003eIterator\u003c/code\u003e\n     * is unmodifiable.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e of the \u003ccode\u003eEnum\u003c/code\u003e objects\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of \u003ccode\u003eEnum\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 54)"
      ]
    }
  ]
}