{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.Builder\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 88,
      "end_line": 1018,
      "comment": " \n * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.\n *\n * It is consistent with \u003ccode\u003eequals(Object)\u003c/code\u003e and\n * \u003ccode\u003ehashcode()\u003c/code\u003e built with {@link EqualsBuilder} and\n * {@link HashCodeBuilder}.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare equal using \u003ccode\u003eequals(Object)\u003c/code\u003e should normally\n * also compare equal using \u003ccode\u003ecompareTo(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of the\n * comparison. Derived fields may be ignored. The same fields, in the same\n * order, should be used in both \u003ccode\u003ecompareTo(Object)\u003c/code\u003e and\n * \u003ccode\u003eequals(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class MyClass {\n *   String field1;\n *   int field2;\n *   boolean field3;\n *\n *   ...\n *\n *   public int compareTo(Object o) {\n *     MyClass myClass \u003d (MyClass) o;\n *     return new CompareToBuilder()\n *       .appendSuper(super.compareTo(o)\n *       .append(this.field1, myClass.field1)\n *       .append(this.field2, myClass.field2)\n *       .append(this.field3, myClass.field3)\n *       .toComparison();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAlternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use\n * reflection to determine the fields to append. Because fields can be private,\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to\n * bypass normal access control checks. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than appending explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical implementation of \u003ccode\u003ecompareTo(Object)\u003c/code\u003e using\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e looks like:\u003c/p\u003e\n\n * \u003cpre\u003e\n * public int compareTo(Object o) {\n *   return CompareToBuilder.reflectionCompare(this, o);\n * }\n * \u003c/pre\u003e\n *\n * @see java.lang.Comparable\n * @see java.lang.Object#equals(Object)\n * @see java.lang.Object#hashCode()\n * @see EqualsBuilder\n * @see HashCodeBuilder\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "comparison"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Current state of the comparison as appended fields are checked.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.CompareToBuilder()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eConstructor for CompareToBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that the objects are equal. Multiple calls are \n     * then made to the various append methods, followed by a call to \n     * {@link #toComparison} to get the result.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 16)",
        "(line 104,col 9)-(line 104,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object)",
      "begin_line": 134,
      "end_line": 136,
      "comment": " \n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eTransient members will be not be compared, as they are likely derived\n     *     fields\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either (but not both) parameters are\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  Collection of String fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.lang.String...)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  array of fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e, java.lang.String...)",
      "begin_line": 268,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @param excludeFields  fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2 (2.0 as \u003ccode\u003ereflectionCompare(Object, Object, boolean, Class)\u003c/code\u003e)\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 43)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 67)",
        "(line 286,col 9)-(line 286,col 97)",
        "(line 287,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.CompareToBuilder, boolean, java.lang.String[])",
      "begin_line": 305,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eAppends to \u003ccode\u003ebuilder\u003c/code\u003e the comparison of \u003ccode\u003elhs\u003c/code\u003e\n     * to \u003ccode\u003erhs\u003c/code\u003e using the fields defined in \u003ccode\u003eclazz\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param clazz  \u003ccode\u003eClass\u003c/code\u003e that defines fields to be compared\n     * @param builder  \u003ccode\u003eCompareToBuilder\u003c/code\u003e to append to\n     * @param useTransients  whether to compare transient fields\n     * @param excludeFields  fields to exclude\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 51)",
        "(line 314,col 9)-(line 314,col 53)",
        "(line 315,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.appendSuper(int)",
      "begin_line": 341,
      "end_line": 347,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the \u003ccode\u003ecompareTo(Object)\u003c/code\u003e\n     * result of the superclass.\u003c/p\u003e\n     *\n     * @param superCompareTo  result of calling \u003ccode\u003esuper.compareTo(Object)\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 36)",
        "(line 346,col 9)-(line 346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003elhs\u003c/code\u003e must either be an array or implement {@link Comparable}.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object, java.util.Comparator\u003c?\u003e)",
      "begin_line": 398,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elhs\u003c/code\u003e is an array, array comparison methods will be used.\n     * Otherwise \u003ccode\u003ecomparator\u003c/code\u003e will be used to compare the objects.\n     * If \u003ccode\u003ecomparator\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003elhs\u003c/code\u003e must\n     * implement {@link Comparable} instead.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e used to compare the objects,\n     *  \u003ccode\u003enull\u003c/code\u003e means treat lhs as \u003ccode\u003eComparable\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(long, long)",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003elong\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 64)",
        "(line 467,col 9)-(line 467,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(int, int)",
      "begin_line": 478,
      "end_line": 484,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eint\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 64)",
        "(line 483,col 9)-(line 483,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(short, short)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 64)",
        "(line 499,col 9)-(line 499,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(char, char)",
      "begin_line": 510,
      "end_line": 516,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003echar\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 64)",
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(byte, byte)",
      "begin_line": 526,
      "end_line": 532,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 64)",
        "(line 531,col 9)-(line 531,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(double, double)",
      "begin_line": 547,
      "end_line": 553,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 46)",
        "(line 552,col 9)-(line 552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(float, float)",
      "begin_line": 568,
      "end_line": 574,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 45)",
        "(line 573,col 9)-(line 573,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(boolean, boolean)",
      "begin_line": 584,
      "end_line": 597,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebooleans\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n      ",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[], java.util.Comparator\u003c?\u003e)",
      "begin_line": 647,
      "end_line": 670,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e to use to compare the array elements,\n     *  \u003ccode\u003enull\u003c/code\u003e means to treat \u003ccode\u003elhs\u003c/code\u003e elements as \u003ccode\u003eComparable\u003c/code\u003e.\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(long[], long[])",
      "begin_line": 687,
      "end_line": 710,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003elong\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(long, long)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(int[], int[])",
      "begin_line": 727,
      "end_line": 750,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eint\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(int, int)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(short[], short[])",
      "begin_line": 767,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(short, short)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(char[], char[])",
      "begin_line": 807,
      "end_line": 830,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003echar\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(char, char)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(byte[], byte[])",
      "begin_line": 847,
      "end_line": 870,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(byte, byte)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(double[], double[])",
      "begin_line": 887,
      "end_line": 910,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(double, double)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(float[], float[])",
      "begin_line": 927,
      "end_line": 950,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(float, float)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(boolean[], boolean[])",
      "begin_line": 967,
      "end_line": 990,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eboolean\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(boolean, boolean)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.toComparison()",
      "begin_line": 1001,
      "end_line": 1003,
      "comment": "\n     * Returns a negative integer, a positive integer, or zero as\n     * the \u003ccode\u003ebuilder\u003c/code\u003e has judged the \"left-hand\" side\n     * as less than, greater than, or equal to the \"right-hand\"\n     * side.\n     * \n     * @return final comparison result\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.build()",
      "begin_line": 1015,
      "end_line": 1017,
      "comment": "\n     * Returns a negative integer, a positive integer, or zero as\n     * the \u003ccode\u003ebuilder\u003c/code\u003e has judged the \"left-hand\" side\n     * as less than, greater than, or equal to the \"right-hand\"\n     * side.\n     * \n     * @return final comparison result\n     * \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 47)"
      ]
    }
  ]
}