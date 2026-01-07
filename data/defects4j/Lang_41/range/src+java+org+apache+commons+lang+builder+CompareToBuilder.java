{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/builder/CompareToBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 1044,
      "comment": " \n * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.\n *\n * It is consistent with \u003ccode\u003eequals(Object)\u003c/code\u003e and\n * \u003ccode\u003ehashcode()\u003c/code\u003e built with {@link EqualsBuilder} and\n * {@link HashCodeBuilder}.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare equal using \u003ccode\u003eequals(Object)\u003c/code\u003e should normally\n * also compare equal using \u003ccode\u003ecompareTo(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of the\n * comparison. Derived fields may be ignored. The same fields, in the same\n * order, should be used in both \u003ccode\u003ecompareTo(Object)\u003c/code\u003e and\n * \u003ccode\u003eequals(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class MyClass {\n *   String field1;\n *   int field2;\n *   boolean field3;\n *\n *   ...\n *\n *   public int compareTo(Object o) {\n *     MyClass myClass \u003d (MyClass) o;\n *     return new CompareToBuilder()\n *       .appendSuper(super.compareTo(o)\n *       .append(this.field1, myClass.field1)\n *       .append(this.field2, myClass.field2)\n *       .append(this.field3, myClass.field3)\n *       .toComparison();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAlternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use\n * reflection to determine the fields to append. Because fields can be private,\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to\n * bypass normal access control checks. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than appending explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical implementation of \u003ccode\u003ecompareTo(Object)\u003c/code\u003e using\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e looks like:\u003c/p\u003e\n\n * \u003cpre\u003e\n * public int compareTo(Object o) {\n *   return CompareToBuilder.reflectionCompare(this, o);\n * }\n * \u003c/pre\u003e\n *\n * @see java.lang.Comparable\n * @see java.lang.Object#equals(Object)\n * @see java.lang.Object#hashCode()\n * @see EqualsBuilder\n * @see HashCodeBuilder\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.CompareToBuilder()",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object)",
      "begin_line": 139,
      "end_line": 141,
      "comment": " \n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eTransient members will be not be compared, as they are likely derived\n     *     fields\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either (but not both) parameters are\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  Collection of String fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  array of fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e, java.lang.String[])",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang.builder.CompareToBuilder, boolean, java.lang.String[])",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.appendSuper(int)",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003elhs\u003c/code\u003e must either be an array or implement {@link Comparable}.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object, java.util.Comparator)",
      "begin_line": 441,
      "end_line": 490,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elhs\u003c/code\u003e is an array, array comparison methods will be used.\n     * Otherwise \u003ccode\u003ecomparator\u003c/code\u003e will be used to compare the objects.\n     * If \u003ccode\u003ecomparator\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003elhs\u003c/code\u003e must\n     * implement {@link Comparable} instead.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e used to compare the objects,\n     *  \u003ccode\u003enull\u003c/code\u003e means treat lhs as \u003ccode\u003eComparable\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(long, long)",
      "begin_line": 501,
      "end_line": 507,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003elong\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 64)",
        "(line 506,col 9)-(line 506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(int, int)",
      "begin_line": 517,
      "end_line": 523,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eint\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 64)",
        "(line 522,col 9)-(line 522,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(short, short)",
      "begin_line": 533,
      "end_line": 539,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 64)",
        "(line 538,col 9)-(line 538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(char, char)",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003echar\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 64)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(byte, byte)",
      "begin_line": 565,
      "end_line": 571,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 64)",
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(double, double)",
      "begin_line": 586,
      "end_line": 592,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 46)",
        "(line 591,col 9)-(line 591,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(float, float)",
      "begin_line": 607,
      "end_line": 613,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 45)",
        "(line 612,col 9)-(line 612,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(boolean, boolean)",
      "begin_line": 623,
      "end_line": 636,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebooleans\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n      ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[], java.util.Comparator\u003c?\u003e)",
      "begin_line": 686,
      "end_line": 709,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e to use to compare the array elements,\n     *  \u003ccode\u003enull\u003c/code\u003e means to treat \u003ccode\u003elhs\u003c/code\u003e elements as \u003ccode\u003eComparable\u003c/code\u003e.\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(long[], long[])",
      "begin_line": 726,
      "end_line": 749,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003elong\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(long, long)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(int[], int[])",
      "begin_line": 766,
      "end_line": 789,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eint\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(int, int)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(short[], short[])",
      "begin_line": 806,
      "end_line": 829,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(short, short)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(char[], char[])",
      "begin_line": 846,
      "end_line": 869,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003echar\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(char, char)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(byte[], byte[])",
      "begin_line": 886,
      "end_line": 909,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(byte, byte)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(double[], double[])",
      "begin_line": 926,
      "end_line": 949,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(double, double)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 948,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(float[], float[])",
      "begin_line": 966,
      "end_line": 989,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(float, float)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(boolean[], boolean[])",
      "begin_line": 1006,
      "end_line": 1029,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eboolean\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(boolean, boolean)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1016,col 9)",
        "(line 1017,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1028,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.toComparison()",
      "begin_line": 1040,
      "end_line": 1042,
      "comment": "\n     * Returns a negative integer, a positive integer, or zero as\n     * the \u003ccode\u003ebuilder\u003c/code\u003e has judged the \"left-hand\" side\n     * as less than, greater than, or equal to the \"right-hand\"\n     * side.\n     * \n     * @return final comparison result\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 26)"
      ]
    }
  ]
}