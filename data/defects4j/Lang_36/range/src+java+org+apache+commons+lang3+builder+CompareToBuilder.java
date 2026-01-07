{
  "filepath": "/tmp/Lang-36b/src/java/org/apache/commons/lang3/builder/CompareToBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 1048,
      "comment": " \n * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.\n *\n * It is consistent with \u003ccode\u003eequals(Object)\u003c/code\u003e and\n * \u003ccode\u003ehashcode()\u003c/code\u003e built with {@link EqualsBuilder} and\n * {@link HashCodeBuilder}.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare equal using \u003ccode\u003eequals(Object)\u003c/code\u003e should normally\n * also compare equal using \u003ccode\u003ecompareTo(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of the\n * comparison. Derived fields may be ignored. The same fields, in the same\n * order, should be used in both \u003ccode\u003ecompareTo(Object)\u003c/code\u003e and\n * \u003ccode\u003eequals(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class MyClass {\n *   String field1;\n *   int field2;\n *   boolean field3;\n *\n *   ...\n *\n *   public int compareTo(Object o) {\n *     MyClass myClass \u003d (MyClass) o;\n *     return new CompareToBuilder()\n *       .appendSuper(super.compareTo(o)\n *       .append(this.field1, myClass.field1)\n *       .append(this.field2, myClass.field2)\n *       .append(this.field3, myClass.field3)\n *       .toComparison();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAlternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use\n * reflection to determine the fields to append. Because fields can be private,\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to\n * bypass normal access control checks. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than appending explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical implementation of \u003ccode\u003ecompareTo(Object)\u003c/code\u003e using\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e looks like:\u003c/p\u003e\n\n * \u003cpre\u003e\n * public int compareTo(Object o) {\n *   return CompareToBuilder.reflectionCompare(this, o);\n * }\n * \u003c/pre\u003e\n *\n * @see java.lang.Comparable\n * @see java.lang.Object#equals(Object)\n * @see java.lang.Object#hashCode()\n * @see EqualsBuilder\n * @see HashCodeBuilder\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "comparison"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Current state of the comparison as appended fields are checked.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.CompareToBuilder()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eConstructor for CompareToBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that the objects are equal. Multiple calls are \n     * then made to the various append methods, followed by a call to \n     * {@link #toComparison} to get the result.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 16)",
        "(line 109,col 9)-(line 109,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object)",
      "begin_line": 139,
      "end_line": 141,
      "comment": " \n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eTransient members will be not be compared, as they are likely derived\n     *     fields\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either (but not both) parameters are\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  Collection of String fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  array of fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e, java.lang.String[])",
      "begin_line": 310,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @param excludeFields  fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 67)",
        "(line 328,col 9)-(line 328,col 97)",
        "(line 329,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.CompareToBuilder, boolean, java.lang.String[])",
      "begin_line": 347,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003eAppends to \u003ccode\u003ebuilder\u003c/code\u003e the comparison of \u003ccode\u003elhs\u003c/code\u003e\n     * to \u003ccode\u003erhs\u003c/code\u003e using the fields defined in \u003ccode\u003eclazz\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param clazz  \u003ccode\u003eClass\u003c/code\u003e that defines fields to be compared\n     * @param builder  \u003ccode\u003eCompareToBuilder\u003c/code\u003e to append to\n     * @param useTransients  whether to compare transient fields\n     * @param excludeFields  fields to exclude\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 51)",
        "(line 356,col 9)-(line 356,col 128)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 358,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.appendSuper(int)",
      "begin_line": 384,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the \u003ccode\u003ecompareTo(Object)\u003c/code\u003e\n     * result of the superclass.\u003c/p\u003e\n     *\n     * @param superCompareTo  result of calling \u003ccode\u003esuper.compareTo(Object)\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 36)",
        "(line 389,col 9)-(line 389,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003elhs\u003c/code\u003e must either be an array or implement {@link Comparable}.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object, java.util.Comparator\u003c?\u003e)",
      "begin_line": 441,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elhs\u003c/code\u003e is an array, array comparison methods will be used.\n     * Otherwise \u003ccode\u003ecomparator\u003c/code\u003e will be used to compare the objects.\n     * If \u003ccode\u003ecomparator\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003elhs\u003c/code\u003e must\n     * implement {@link Comparable} instead.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e used to compare the objects,\n     *  \u003ccode\u003enull\u003c/code\u003e means treat lhs as \u003ccode\u003eComparable\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(long, long)",
      "begin_line": 505,
      "end_line": 511,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003elong\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 64)",
        "(line 510,col 9)-(line 510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(int, int)",
      "begin_line": 521,
      "end_line": 527,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eint\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 64)",
        "(line 526,col 9)-(line 526,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(short, short)",
      "begin_line": 537,
      "end_line": 543,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 64)",
        "(line 542,col 9)-(line 542,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(char, char)",
      "begin_line": 553,
      "end_line": 559,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003echar\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 64)",
        "(line 558,col 9)-(line 558,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(byte, byte)",
      "begin_line": 569,
      "end_line": 575,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 64)",
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(double, double)",
      "begin_line": 590,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 46)",
        "(line 595,col 9)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(float, float)",
      "begin_line": 611,
      "end_line": 617,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 45)",
        "(line 616,col 9)-(line 616,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(boolean, boolean)",
      "begin_line": 627,
      "end_line": 640,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebooleans\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n      ",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[], java.util.Comparator\u003c?\u003e)",
      "begin_line": 690,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e to use to compare the array elements,\n     *  \u003ccode\u003enull\u003c/code\u003e means to treat \u003ccode\u003elhs\u003c/code\u003e elements as \u003ccode\u003eComparable\u003c/code\u003e.\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(long[], long[])",
      "begin_line": 730,
      "end_line": 753,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003elong\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(long, long)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(int[], int[])",
      "begin_line": 770,
      "end_line": 793,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eint\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(int, int)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(short[], short[])",
      "begin_line": 810,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(short, short)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(char[], char[])",
      "begin_line": 850,
      "end_line": 873,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003echar\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(char, char)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(byte[], byte[])",
      "begin_line": 890,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(byte, byte)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(double[], double[])",
      "begin_line": 930,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(double, double)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(float[], float[])",
      "begin_line": 970,
      "end_line": 993,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(float, float)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.append(boolean[], boolean[])",
      "begin_line": 1010,
      "end_line": 1033,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eboolean\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(boolean, boolean)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1016,col 9)",
        "(line 1017,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilder.toComparison()",
      "begin_line": 1044,
      "end_line": 1046,
      "comment": "\n     * Returns a negative integer, a positive integer, or zero as\n     * the \u003ccode\u003ebuilder\u003c/code\u003e has judged the \"left-hand\" side\n     * as less than, greater than, or equal to the \"right-hand\"\n     * side.\n     * \n     * @return final comparison result\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 26)"
      ]
    }
  ]
}