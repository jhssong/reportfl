{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/builder/CompareToBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 94,
      "end_line": 1006,
      "comment": " \n * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.\n *\n * It is consistent with \u003ccode\u003eequals(Object)\u003c/code\u003e and\n * \u003ccode\u003ehashcode()\u003c/code\u003e built with {@link EqualsBuilder} and\n * {@link HashCodeBuilder}.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare equal using \u003ccode\u003eequals(Object)\u003c/code\u003e should normally\n * also compare equal using \u003ccode\u003ecompareTo(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of the\n * comparison. Derived fields may be ignored. The same fields, in the same\n * order, should be used in both \u003ccode\u003ecompareTo(Object)\u003c/code\u003e and\n * \u003ccode\u003eequals(Object)\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class MyClass {\n *   String field1;\n *   int field2;\n *   boolean field3;\n *\n *   ...\n *\n *   public int compareTo(Object o) {\n *     MyClass myClass \u003d (MyClass) o;\n *     return new CompareToBuilder()\n *       .appendSuper(super.compareTo(o)\n *       .append(this.field1, myClass.field1)\n *       .append(this.field2, myClass.field2)\n *       .append(this.field3, myClass.field3)\n *       .toComparison();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAlternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use\n * reflection to determine the fields to append. Because fields can be private,\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to\n * bypass normal access control checks. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than appending explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical implementation of \u003ccode\u003ecompareTo(Object)\u003c/code\u003e using\n * \u003ccode\u003ereflectionCompare\u003c/code\u003e looks like:\u003c/p\u003e\n\n * \u003cpre\u003e\n * public int compareTo(Object o) {\n *   return CompareToBuilder.reflectionCompare(this, o);\n * }\n * \u003c/pre\u003e\n *\n * @see java.lang.Comparable\n * @see java.lang.Object#equals(Object)\n * @see java.lang.Object#hashCode()\n * @see EqualsBuilder\n * @see HashCodeBuilder\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "comparison"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Current state of the comparison as appended fields are checked.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.CompareToBuilder()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eConstructor for CompareToBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that the objects are equal. Multiple calls are \n     * then made to the various append methods, followed by a call to \n     * {@link #toComparison} to get the result.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 110,col 9)-(line 110,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object)",
      "begin_line": 140,
      "end_line": 142,
      "comment": " \n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eTransient members will be not be compared, as they are likely derived\n     *     fields\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either (but not both) parameters are\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.util.Collection)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  Collection of String fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eSuperclass fields will be compared\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param excludeFields  array of fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[])",
      "begin_line": 272,
      "end_line": 296,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003eObject\u003c/code\u003es via reflection.\u003c/p\u003e\n     *\n     * \u003cp\u003eFields can be private, thus \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n     * is used to bypass normal access control checks. This will fail under a \n     * security manager unless the appropriate permissions are set.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003eStatic fields will not be compared\u003c/li\u003e\n     * \u003cli\u003eIf the \u003ccode\u003ecompareTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     *     compares transient members.  Otherwise ignores them, as they\n     *     are likely derived fields.\u003c/li\u003e\n     * \u003cli\u003eCompares superclass fields up to and including \u003ccode\u003ereflectUpToClass\u003c/code\u003e.\n     *     If \u003ccode\u003ereflectUpToClass\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, compares all superclass fields.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf both \u003ccode\u003elhs\u003c/code\u003e and \u003ccode\u003erhs\u003c/code\u003e are \u003ccode\u003enull\u003c/code\u003e,\n     * they are considered equal.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param compareTransients  whether to compare transient fields\n     * @param reflectUpToClass  last superclass for which fields are compared\n     * @param excludeFields  fields to exclude\n     * @return a negative integer, zero, or a positive integer as \u003ccode\u003elhs\u003c/code\u003e\n     *  is less than, equal to, or greater than \u003ccode\u003erhs\u003c/code\u003e\n     * @throws NullPointerException  if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e\n     *  (but not both) is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 40)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 290,col 97)",
        "(line 291,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class, org.apache.commons.lang.builder.CompareToBuilder, boolean, java.lang.String[])",
      "begin_line": 309,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003eAppends to \u003ccode\u003ebuilder\u003c/code\u003e the comparison of \u003ccode\u003elhs\u003c/code\u003e\n     * to \u003ccode\u003erhs\u003c/code\u003e using the fields defined in \u003ccode\u003eclazz\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param clazz  \u003ccode\u003eClass\u003c/code\u003e that defines fields to be compared\n     * @param builder  \u003ccode\u003eCompareToBuilder\u003c/code\u003e to append to\n     * @param useTransients  whether to compare transient fields\n     * @param excludeFields  fields to exclude\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 51)",
        "(line 318,col 9)-(line 318,col 111)",
        "(line 319,col 9)-(line 319,col 53)",
        "(line 320,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.appendSuper(int)",
      "begin_line": 346,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the \u003ccode\u003ecompareTo(Object)\u003c/code\u003e\n     * result of the superclass.\u003c/p\u003e\n     *\n     * @param superCompareTo  result of calling \u003ccode\u003esuper.compareTo(Object)\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 36)",
        "(line 351,col 9)-(line 351,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003elhs\u003c/code\u003e must either be an array or implement {@link Comparable}.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object, java.lang.Object, java.util.Comparator)",
      "begin_line": 403,
      "end_line": 452,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eCheck if \u003ccode\u003elhs \u003d\u003d rhs\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eCheck if either \u003ccode\u003elhs\u003c/code\u003e or \u003ccode\u003erhs\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *     a \u003ccode\u003enull\u003c/code\u003e object is less than a non-\u003ccode\u003enull\u003c/code\u003e object\u003c/li\u003e\n     * \u003cli\u003eCheck the object contents\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elhs\u003c/code\u003e is an array, array comparison methods will be used.\n     * Otherwise \u003ccode\u003ecomparator\u003c/code\u003e will be used to compare the objects.\n     * If \u003ccode\u003ecomparator\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003elhs\u003c/code\u003e must\n     * implement {@link Comparable} instead.\u003c/p\u003e\n     *\n     * @param lhs  left-hand object\n     * @param rhs  right-hand object\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e used to compare the objects,\n     *  \u003ccode\u003enull\u003c/code\u003e means treat lhs as \u003ccode\u003eComparable\u003c/code\u003e\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(long, long)",
      "begin_line": 463,
      "end_line": 469,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003elong\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 64)",
        "(line 468,col 9)-(line 468,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(int, int)",
      "begin_line": 479,
      "end_line": 485,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eint\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 64)",
        "(line 484,col 9)-(line 484,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(short, short)",
      "begin_line": 495,
      "end_line": 501,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 64)",
        "(line 500,col 9)-(line 500,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(char, char)",
      "begin_line": 511,
      "end_line": 517,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003echar\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 64)",
        "(line 516,col 9)-(line 516,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(byte, byte)",
      "begin_line": 527,
      "end_line": 533,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003es.\n     * \n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 64)",
        "(line 532,col 9)-(line 532,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(double, double)",
      "begin_line": 548,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 51)",
        "(line 553,col 9)-(line 553,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(float, float)",
      "begin_line": 569,
      "end_line": 575,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 51)",
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(boolean, boolean)",
      "begin_line": 585,
      "end_line": 598,
      "comment": "\n     * Appends to the \u003ccode\u003ebuilder\u003c/code\u003e the comparison of\n     * two \u003ccode\u003ebooleans\u003c/code\u003es.\n     *\n     * @param lhs  left-hand value\n     * @param rhs  right-hand value\n     * @return this - used to chain append calls\n      ",
      "child_ranges": [
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(java.lang.Object[], java.lang.Object[], java.util.Comparator)",
      "begin_line": 648,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a short length array is less than a long length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(Object, Object, Comparator)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eThis method will also will be called for the top level of multi-dimensional,\n     * ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @param comparator  \u003ccode\u003eComparator\u003c/code\u003e to use to compare the array elements,\n     *  \u003ccode\u003enull\u003c/code\u003e means to treat \u003ccode\u003elhs\u003c/code\u003e elements as \u003ccode\u003eComparable\u003c/code\u003e.\n     * @return this - used to chain append calls\n     * @throws ClassCastException  if \u003ccode\u003erhs\u003c/code\u003e is not assignment-compatible\n     *  with \u003ccode\u003elhs\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(long[], long[])",
      "begin_line": 688,
      "end_line": 711,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003elong\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(long, long)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(int[], int[])",
      "begin_line": 728,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eint\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(int, int)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(short[], short[])",
      "begin_line": 768,
      "end_line": 791,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eshort\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(short, short)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(char[], char[])",
      "begin_line": 808,
      "end_line": 831,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003echar\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(char, char)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(byte[], byte[])",
      "begin_line": 848,
      "end_line": 871,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003ebyte\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(byte, byte)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(double[], double[])",
      "begin_line": 888,
      "end_line": 911,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003edouble\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(double, double)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(float[], float[])",
      "begin_line": 928,
      "end_line": 951,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003efloat\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(float, float)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.append(boolean[], boolean[])",
      "begin_line": 968,
      "end_line": 991,
      "comment": "\n     * \u003cp\u003eAppends to the \u003ccode\u003ebuilder\u003c/code\u003e the deep comparison of\n     * two \u003ccode\u003eboolean\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003eCheck if arrays are the same using \u003ccode\u003e\u003d\u003d\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck if for \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is less than non-\u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eCheck array length, a shorter length array is less than a longer length array\u003c/li\u003e\n     *  \u003cli\u003eCheck array contents element by element using {@link #append(boolean, boolean)}\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param lhs  left-hand array\n     * @param rhs  right-hand array\n     * @return this - used to chain append calls\n     ",
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
      "signature": "org.apache.commons.lang.builder.CompareToBuilder.toComparison()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\n     * Returns a negative integer, a positive integer, or zero as\n     * the \u003ccode\u003ebuilder\u003c/code\u003e has judged the \"left-hand\" side\n     * as less than, greater than, or equal to the \"right-hand\"\n     * side.\n     * \n     * @return final comparison result\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 26)"
      ]
    }
  ]
}