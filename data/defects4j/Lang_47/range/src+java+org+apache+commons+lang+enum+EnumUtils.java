{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/enum/EnumUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 128,
      "comment": "\n * \u003cp\u003eUtility class for accessing and manipulating {@link Enum}s.\u003c/p\u003e\n *\n//  * @deprecated Replaced by {@link org.apache.commons.lang.enums.EnumUtils org.apache.commons.lang.enums.EnumUtils} \n *          and will be removed in version 3.0. All classes in this package are deprecated and repackaged to \n//  *          {@link org.apache.commons.lang.enums} since \u003ccode\u003eenum\u003c/code\u003e is a Java 1.5 keyword. \n//  * @see org.apache.commons.lang.enums.EnumUtils\n * @see Enum\n * @see ValuedEnum\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "EnumUtils.EnumUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Public constructor. This class should not normally be instantiated.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "EnumUtils.getEnum(java.lang.Class, java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEnum\u003c/code\u003e object by class and name.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @param name  the name of the Enum to get, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "EnumUtils.getEnum(java.lang.Class, int)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eValuedEnum\u003c/code\u003e object by class and value.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @param value  the value of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum object, or null if the enum does not exist\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "EnumUtils.getEnumMap(java.lang.Class)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eMap\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects by\n     * name using the \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eMap\u003c/code\u003e is returned. The \u003ccode\u003eMap\u003c/code\u003e is unmodifiable.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass\n     *  of \u003ccode\u003eEnum\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "EnumUtils.getEnumList(java.lang.Class)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects using\n     * the \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe list is in the order that the objects were created\n     * (source code order).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eList\u003c/code\u003e is returned. The \u003ccode\u003eList\u003c/code\u003e is unmodifiable.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the Enum to get\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass\n     *  of \u003ccode\u003eEnum\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "EnumUtils.iterator(java.lang.Class)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eIterator\u003c/code\u003e over the \u003ccode\u003eEnum\u003c/code\u003e objects\n     * in an \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe iterator is in the order that the objects were created\n     * (source code order).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eIterator\u003c/code\u003e is returned. The \u003ccode\u003eIterator\u003c/code\u003e\n     * is unmodifiable.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e of the \u003ccode\u003eEnum\u003c/code\u003e objects\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of \u003ccode\u003eEnum\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 54)"
      ]
    }
  ]
}