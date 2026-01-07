{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.TestUtils.TestUtils()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(java.lang.String, java.lang.Object)",
      "begin_line": 45,
      "end_line": 68,
      "comment": "\n     * Asserts that deserialization of the object returns the same object as the\n     * one that was serialized. Object is first serialized, then deserialized\n     * and finally check is performed to see if original and deserialized\n     * object references are the same.\n     * \u003cp\u003e\n     * This method is especially good for testing singleton pattern on classes\n     * that support serialization.\n     *\n     * @param msg the identifying message for the \u003ccode\u003eAssertionError\u003c/code\u003e.\n     * @param o object that will be tested.\n     * @see #assertSameAfterSerialization(Object)\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(java.lang.Object)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Asserts that deserialization of the object returns the same object as the\n     * one that was serialized.\n     * \u003cp\u003e\n     * Effect of method call is the same as:\n     * \u003ccode\u003eassertSameAfterSerialization(null, o)\u003c/code\u003e.\n     *\n     * @param o object that will be tested.\n     * @see #assertSameAfterSerialization(String, Object)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 46)"
      ]
    }
  ]
}