{
  "filepath": "/tmp/Codec-2b/src/test/org/apache/commons/codec/net/BCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BCodecTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 153,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodecTest.BCodecTest(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.constructString(int[])",
      "begin_line": 43,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 49)",
        "(line 45,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testNullInput()",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 37)",
        "(line 55,col 9)-(line 55,col 44)",
        "(line 56,col 9)-(line 56,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testUTF8RoundTrip()",
      "begin_line": 59,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 63)",
        "(line 62,col 9)-(line 62,col 68)",
        "(line 64,col 9)-(line 64,col 44)",
        "(line 66,col 9)-(line 66,col 88)",
        "(line 67,col 9)-(line 67,col 80)",
        "(line 69,col 9)-(line 69,col 67)",
        "(line 70,col 9)-(line 70,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testBasicEncodeDecode()",
      "begin_line": 73,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 37)",
        "(line 76,col 9)-(line 76,col 46)",
        "(line 77,col 9)-(line 77,col 87)",
        "(line 78,col 9)-(line 78,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testEncodeDecodeNull()",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 80)",
        "(line 84,col 9)-(line 84,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testEncodeStringWithNull()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 91,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testDecodeStringWithNull()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)",
        "(line 96,col 9)-(line 96,col 27)",
        "(line 97,col 9)-(line 97,col 44)",
        "(line 98,col 9)-(line 98,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testEncodeObjects()",
      "begin_line": 101,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 37)",
        "(line 103,col 9)-(line 103,col 34)",
        "(line 104,col 9)-(line 104,col 64)",
        "(line 106,col 9)-(line 106,col 83)",
        "(line 108,col 9)-(line 108,col 53)",
        "(line 109,col 9)-(line 109,col 80)",
        "(line 111,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testInvalidEncoding()",
      "begin_line": 120,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 47)",
        "(line 122,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testDecodeObjects()",
      "begin_line": 136,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 37)",
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 139,col 64)",
        "(line 140,col 9)-(line 140,col 65)",
        "(line 142,col 9)-(line 142,col 53)",
        "(line 143,col 9)-(line 143,col 80)",
        "(line 145,col 9)-(line 151,col 9)"
      ]
    }
  ]
}