{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/digest/UnixCryptTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnixCryptTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testCtor()",
      "begin_line": 29,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptStrings()",
      "begin_line": 34,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 67)",
        "(line 39,col 9)-(line 39,col 61)",
        "(line 41,col 9)-(line 41,col 67)",
        "(line 42,col 9)-(line 42,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptBytes()",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 70)",
        "(line 50,col 9)-(line 50,col 70)",
        "(line 52,col 9)-(line 52,col 100)",
        "(line 53,col 9)-(line 53,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptExplicitCall()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * Some salts are invalid for crypt(3) but not for unixCrypt().\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 88)",
        "(line 64,col 9)-(line 64,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptWithHalfSalt()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Single character salts are illegal!\n     * E.g. with glibc 2.13, crypt(\"secret\", \"x\") \u003d \"xxZREZpkHZpkI\" but\n     * crypt(\"secret\", \"xx\") \u003d \"xxWAum7tHdIUw\" which makes it unverifyable.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnicCryptInvalidSalt()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Unimplemented \"$foo$\" salt prefixes would be threated as UnixCrypt salt.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptNullData()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptWithEmptySalt()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCryptTest.testUnixCryptWithoutSalt()",
      "begin_line": 95,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 51)",
        "(line 98,col 9)-(line 98,col 56)",
        "(line 99,col 9)-(line 99,col 52)",
        "(line 100,col 9)-(line 100,col 35)"
      ]
    }
  ]
}