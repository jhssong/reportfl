{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/reflect/MemberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MemberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 220,
      "comment": "\n * Contains common code for working with Methods/Constructors, extracted and\n * refactored from \u003ccode\u003eMethodUtils\u003c/code\u003e when it was imported from Commons BeanUtils.\n *\n * @author Steve Cohen\n * @author Matt Benson\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_TEST"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IS_SYNTHETIC"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ORDERED_PRIMITIVE_TYPES"
      ],
      "begin_line": 57,
      "end_line": 59,
      "comment": " Array of primitive number types ordered by \"promotability\" "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.setAccessibleWorkaround(java.lang.reflect.AccessibleObject)",
      "begin_line": 73,
      "end_line": 85,
      "comment": "\n     * XXX Default access superclass workaround\n     *\n     * When a public class has a default access superclass with public\n     * members, these members are accessible. Calling them from\n     * compiled code works fine. Unfortunately, on some JVMs, using reflection to invoke these\n     * members seems to (wrongly) to prevent access even when the\n     * modifer is public. Calling setAccessible(true) solves the problem\n     * but will only work from sufficiently privileged code. Better\n     * workarounds would be gratefully accepted.\n     * @param o the AccessibleObject to set as accessible\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.isPackageAccess(int)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Learn whether a given set of modifiers implies package access.\n     * @param modifiers to test\n     * @return true unless package/protected/private modifier detected\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.isAccessible(java.lang.reflect.Member)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Check a Member for basic accessibility.\n     * @param m Member to check\n     * @return true if \u003ccode\u003em\u003c/code\u003e is accessible\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.isSynthetic(java.lang.reflect.Member)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Try to learn whether a given member, on JDK \u003e\u003d 1.5, is synthetic.\n     * @param m Member to check\n     * @return true if \u003ccode\u003em\u003c/code\u003e was introduced by the compiler.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.compareParameterTypes(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Compare the relative fitness of two sets of parameter types in terms of\n     * matching a third set of runtime parameter types, such that a list ordered\n     * by the results of the comparison would return the best match first (least).\n     *\n     * @param left the \"left\" parameter set\n     * @param right the \"right\" parameter set\n     * @param actual the runtime parameter types to match against \u003ccode\u003eleft\u003c/code\u003e/\u003ccode\u003eright\u003c/code\u003e\n     * @return int consistent with \u003ccode\u003ecompare\u003c/code\u003e semantics\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 66)",
        "(line 133,col 9)-(line 133,col 68)",
        "(line 134,col 9)-(line 134,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.getTotalTransformationCost(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 144,
      "end_line": 154,
      "comment": "\n     * Returns the sum of the object transformation cost for each class in the source\n     * argument list.\n     * @param srcArgs The source arguments\n     * @param destArgs The destination arguments\n     * @return The total transformation cost\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.getObjectTransformationCost(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 164,
      "end_line": 192,
      "comment": "\n     * Gets the number of steps required needed to turn the source class into the \n     * destination class. This represents the number of steps in the object hierarchy \n     * graph.\n     * @param srcClass The source class\n     * @param destClass The destination class\n     * @return The cost of transforming an object\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 26)",
        "(line 170,col 9)-(line 183,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MemberUtils.getPrimitivePromotionCost(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 200,
      "end_line": 218,
      "comment": "\n     * Get the number of steps required to promote a primitive number to another type.\n     * @param srcClass the (primitive) source class\n     * @param destClass the (primitive) destination class\n     * @return The cost of promoting the primitive\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 26)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 20)"
      ]
    }
  ]
}