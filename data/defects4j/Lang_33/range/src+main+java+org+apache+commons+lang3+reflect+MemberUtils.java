{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MemberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 188,
      "comment": "\n * Contains common code for working with Methods/Constructors, extracted and\n * refactored from \u003ccode\u003eMethodUtils\u003c/code\u003e when it was imported from Commons\n * BeanUtils.\n *\n * @author Apache Software Foundation\n * @author Steve Cohen\n * @author Matt Benson\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_TEST"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ORDERED_PRIMITIVE_TYPES"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": " Array of primitive number types ordered by \"promotability\" "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(java.lang.reflect.AccessibleObject)",
      "begin_line": 57,
      "end_line": 70,
      "comment": "\n     * XXX Default access superclass workaround\n     *\n     * When a public class has a default access superclass with public members,\n     * these members are accessible. Calling them from compiled code works fine.\n     * Unfortunately, on some JVMs, using reflection to invoke these members\n     * seems to (wrongly) to prevent access even when the modifer is public.\n     * Calling setAccessible(true) solves the problem but will only work from\n     * sufficiently privileged code. Better workarounds would be gratefully\n     * accepted.\n     * @param o the AccessibleObject to set as accessible\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 30)",
        "(line 62,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.isPackageAccess(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Learn whether a given set of modifiers implies package access.\n     * @param modifiers to test\n     * @return true unless package/protected/private modifier detected\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.isAccessible(java.lang.reflect.Member)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Check a Member for basic accessibility.\n     * @param m Member to check\n     * @return true if \u003ccode\u003em\u003c/code\u003e is accessible\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.compareParameterTypes(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Compare the relative fitness of two sets of parameter types in terms of\n     * matching a third set of runtime parameter types, such that a list ordered\n     * by the results of the comparison would return the best match first\n     * (least).\n     *\n     * @param left the \"left\" parameter set\n     * @param right the \"right\" parameter set\n     * @param actual the runtime parameter types to match against\n     * \u003ccode\u003eleft\u003c/code\u003e/\u003ccode\u003eright\u003c/code\u003e\n     * @return int consistent with \u003ccode\u003ecompare\u003c/code\u003e semantics\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 66)",
        "(line 104,col 9)-(line 104,col 68)",
        "(line 105,col 9)-(line 105,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.getTotalTransformationCost(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 115,
      "end_line": 124,
      "comment": "\n     * Returns the sum of the object transformation cost for each class in the\n     * source argument list.\n     * @param srcArgs The source arguments\n     * @param destArgs The destination arguments\n     * @return The total transformation cost\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 31)",
        "(line 117,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.getObjectTransformationCost(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 134,
      "end_line": 160,
      "comment": "\n     * Gets the number of steps required needed to turn the source class into\n     * the destination class. This represents the number of steps in the object\n     * hierarchy graph.\n     * @param srcClass The source class\n     * @param destClass The destination class\n     * @return The cost of transforming an object\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 26)",
        "(line 139,col 9)-(line 151,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.getPrimitivePromotionCost(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 169,
      "end_line": 186,
      "comment": "\n     * Get the number of steps required to promote a primitive number to another\n     * type.\n     * @param srcClass the (primitive) source class\n     * @param destClass the (primitive) destination class\n     * @return The cost of promoting the primitive\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 26)",
        "(line 171,col 9)-(line 171,col 32)",
        "(line 172,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 20)"
      ]
    }
  ]
}