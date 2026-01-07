{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/builder/CompareToBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 1046,
      "comment": " \n * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.\n *\n * It is consistent with \u003ccode\u003eequals(Object)\u003c/code\u003e and\n * \u003ccode\u003ehashcode()\u003c/code\u003e built with {@link EqualsBuilder} and\n * {@link HashCodeBuilder}.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare equal using \u003ccode\u003eequals(Object)\u003c/code\u003e should normally\n * also compare equal using \u003ccode\u003ecompareTo(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of the\n * comparison. Derived fields may be ignored. The same fields, in the same\n * order, should be used in both \u003ccode\u003ecompareTo(Object)\u003c/code\u003e and\n * \u003ccode\u003eequals(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class MyClass {\n *   String field1;\n *   int field2;\n *   boolean field3;\n *\n *   ...\n *\n *   public int compareTo(Object o) {\n *     MyClass myClass \u003d (MyClass) o;\n *     return new CompareToBuilder()\n *       .appendSuper(super.compareTo(o)\n *       .append(this.field1, myClass.field1)\n *       .append(this.field2, myClass.field2)\n *       .append(this.field3, myClass.field3)\n *       .toComparison();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAlternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use\n * reflection to determine the fields to append. Because fields can be private,\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to\n * bypass normal access control checks. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than appending explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical implementation of \u003ccode\u003ecompareTo(Object)\u003c/code\u003e using\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e looks like:\u003c/p\u003e\n\n * \u003cpre\u003e\n * public int compareTo(Object o) {\n *   return CompareToBuilder.reflectionCompare(this, o);\n * }\n * \u003c/pre\u003e\n *\n * @see java.lang.Comparable\n * @see java.lang.Object#equals(Object)\n * @see java.lang.Object#hashCode()\n * @see EqualsBuilder\n * @see HashCodeBuilder\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "comparison"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Current state of the comparison as appended fields are checked.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.CompareToBuilder()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eConstructor for CompareToBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that the objects are equal. Multiple calls are \n     * then made to the various append methods, followed by a call to \n     * {@link #toComparison} to get the result.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 111,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object)",
      "begin_line": 141,
      "end_line": 143,
      "comment": " \n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eTransient members will be not be compared, as they are likely derived\n     *     fields\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either (but not both) parameters are\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.util.Collection)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  Collection of String fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  array of fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[])",
      "begin_line": 312,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @param excludeFields  fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 40)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 67)",
        "(line 330,col 9)-(line 330,col 97)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class, org.apache.commons.lang.builder.CompareToBuilder, boolean, java.lang.String[])",
      "begin_line": 349,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003eAppends to \u003ccode\u003ebuilder\u003c/code\u003e the comparison of \u003ccode\u003elhs\u003c/code\u003e\n     * to \u003ccode\u003erhs\u003c/code\u003e using the fields defined in \u003ccode\u003eclazz\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param clazz  \u003ccode\u003eClass\u003c/code\u003e that defines fields to be compared\n     * @param builder  \u003ccode\u003eCompareToBuilder\u003c/code\u003e to append to\n     * @param useTransients  whether to compare transient fields\n     * @param excludeFields  fields to exclude\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 51)",
        "(line 358,col 9)-(line 358,col 111)",
        "(line 359,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.appendSuper(int)",
      "begin_line": 386,
      "end_line": 392,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the \u003ccode\u003ecompareTo(Object)\u003c/code\u003e\n     * result of the superclass.\u003c/p\u003e\n     *\n     * @param superCompareTo  result of calling \u003ccode\u003esuper.compareTo(Object)\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 36)",
        "(line 391,col 9)-(line 391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003elhs\u003c/code\u003e must either be an array or implement {@link Comparable}.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object, java.util.Comparator)",
      "begin_line": 443,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elhs\u003c/code\u003e is an array, array comparison methods will be used.\n     * Otherwise \u003ccode\u003ecomparator\u003c/code\u003e will be used to compare the objects.\n     * If \u003ccode\u003ecomparator\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003elhs\u003c/code\u003e must\n     * implement {@link Comparable} instead.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e used to compare the objects,\n     *  \u003ccode\u003enull\u003c/code\u003e means treat lhs as \u003ccode\u003eComparable\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(long, long)",
      "begin_line": 503,
      "end_line": 509,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003elong\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 64)",
        "(line 508,col 9)-(line 508,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(int, int)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eint\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 64)",
        "(line 524,col 9)-(line 524,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(short, short)",
      "begin_line": 535,
      "end_line": 541,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 64)",
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(char, char)",
      "begin_line": 551,
      "end_line": 557,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003echar\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 64)",
        "(line 556,col 9)-(line 556,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(byte, byte)",
      "begin_line": 567,
      "end_line": 573,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 64)",
        "(line 572,col 9)-(line 572,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(double, double)",
      "begin_line": 588,
      "end_line": 594,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 51)",
        "(line 593,col 9)-(line 593,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(float, float)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 51)",
        "(line 614,col 9)-(line 614,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(boolean, boolean)",
      "begin_line": 625,
      "end_line": 638,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebooleans\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n      ",
      "child_ranges": [
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[], java.util.Comparator)",
      "begin_line": 688,
      "end_line": 711,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e to use to compare the array elements,\n     *  \u003ccode\u003enull\u003c/code\u003e means to treat \u003ccode\u003elhs\u003c/code\u003e elements as \u003ccode\u003eComparable\u003c/code\u003e.\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(long[], long[])",
      "begin_line": 728,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003elong\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(long, long)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(int[], int[])",
      "begin_line": 768,
      "end_line": 791,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eint\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(int, int)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(short[], short[])",
      "begin_line": 808,
      "end_line": 831,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(short, short)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(char[], char[])",
      "begin_line": 848,
      "end_line": 871,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003echar\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(char, char)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(byte[], byte[])",
      "begin_line": 888,
      "end_line": 911,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(byte, byte)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(double[], double[])",
      "begin_line": 928,
      "end_line": 951,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(double, double)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 946,col 9)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(float[], float[])",
      "begin_line": 968,
      "end_line": 991,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(float, float)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(boolean[], boolean[])",
      "begin_line": 1008,
      "end_line": 1031,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eboolean\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(boolean, boolean)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1030,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.toComparison()",
      "begin_line": 1042,
      "end_line": 1044,
      "comment": "\n     * Returns a negative integer, a positive integer, or zero as\n     * the \u003ccode\u003ebuilder\u003c/code\u003e has judged the \"left-hand\" side\n     * as less than, greater than, or equal to the \"right-hand\"\n     * side.\n     * \n     * @return final comparison result\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 26)"
      ]
    }
  ]
}