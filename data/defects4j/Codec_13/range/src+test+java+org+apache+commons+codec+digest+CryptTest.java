{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/digest/CryptTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CryptTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.CryptTest.testCrypt()",
      "begin_line": 27,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.CryptTest.testDefaultCryptVariant()",
      "begin_line": 32,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 60)",
        "(line 36,col 9)-(line 36,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.CryptTest.testCryptWithBytes()",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 66)",
        "(line 42,col 9)-(line 42,col 50)",
        "(line 43,col 9)-(line 43,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.CryptTest.testCryptWithEmptySalt()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * An empty string as salt is invalid.\n     *\n     * The C and Perl implementations return an empty string, PHP threads it\n     * as NULL. Our implementation should throw an Exception as any resulting\n     * hash would not be verifyable with other implementations of crypt().\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 34)"
      ]
    }
  ]
}