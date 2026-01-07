{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MemberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 185,
      "comment": "\n * Contains common code for working with Methods/Constructors, extracted and\n * refactored from \u003ccode\u003eMethodUtils\u003c/code\u003e when it was imported from Commons\n * BeanUtils.\n *\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_TEST"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ORDERED_PRIMITIVE_TYPES"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Array of primitive number types ordered by \"promotability\" "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(java.lang.reflect.AccessibleObject)",
      "begin_line": 54,
      "end_line": 67,
      "comment": "\n     * XXX Default access superclass workaround\n     *\n     * When a public class has a default access superclass with public members,\n     * these members are accessible. Calling them from compiled code works fine.\n     * Unfortunately, on some JVMs, using reflection to invoke these members\n     * seems to (wrongly) to prevent access even when the modifer is public.\n     * Calling setAccessible(true) solves the problem but will only work from\n     * sufficiently privileged code. Better workarounds would be gratefully\n     * accepted.\n     * @param o the AccessibleObject to set as accessible\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 30)",
        "(line 59,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.isPackageAccess(int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Learn whether a given set of modifiers implies package access.\n     * @param modifiers to test\n     * @return true unless package/protected/private modifier detected\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.isAccessible(java.lang.reflect.Member)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Check a Member for basic accessibility.\n     * @param m Member to check\n     * @return true if \u003ccode\u003em\u003c/code\u003e is accessible\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.compareParameterTypes(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Compare the relative fitness of two sets of parameter types in terms of\n     * matching a third set of runtime parameter types, such that a list ordered\n     * by the results of the comparison would return the best match first\n     * (least).\n     *\n     * @param left the \"left\" parameter set\n     * @param right the \"right\" parameter set\n     * @param actual the runtime parameter types to match against\n     * \u003ccode\u003eleft\u003c/code\u003e/\u003ccode\u003eright\u003c/code\u003e\n     * @return int consistent with \u003ccode\u003ecompare\u003c/code\u003e semantics\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 66)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 102,col 9)-(line 102,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.getTotalTransformationCost(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n     * Returns the sum of the object transformation cost for each class in the\n     * source argument list.\n     * @param srcArgs The source arguments\n     * @param destArgs The destination arguments\n     * @return The total transformation cost\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.getObjectTransformationCost(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 131,
      "end_line": 157,
      "comment": "\n     * Gets the number of steps required needed to turn the source class into\n     * the destination class. This represents the number of steps in the object\n     * hierarchy graph.\n     * @param srcClass The source class\n     * @param destClass The destination class\n     * @return The cost of transforming an object\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 26)",
        "(line 136,col 9)-(line 148,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MemberUtils.getPrimitivePromotionCost(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 166,
      "end_line": 183,
      "comment": "\n     * Get the number of steps required to promote a primitive number to another\n     * type.\n     * @param srcClass the (primitive) source class\n     * @param destClass the (primitive) destination class\n     * @return The cost of promoting the primitive\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 26)",
        "(line 168,col 9)-(line 168,col 32)",
        "(line 169,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 20)"
      ]
    }
  ]
}