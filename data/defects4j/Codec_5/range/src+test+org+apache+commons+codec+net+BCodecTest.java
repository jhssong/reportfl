{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/net/BCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BCodecTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 154,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodecTest.BCodecTest(java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.constructString(int[])",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 49)",
        "(line 46,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testNullInput()",
      "begin_line": 54,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 37)",
        "(line 56,col 9)-(line 56,col 44)",
        "(line 57,col 9)-(line 57,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testUTF8RoundTrip()",
      "begin_line": 60,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 63)",
        "(line 63,col 9)-(line 63,col 68)",
        "(line 65,col 9)-(line 65,col 55)",
        "(line 67,col 9)-(line 67,col 88)",
        "(line 68,col 9)-(line 68,col 80)",
        "(line 70,col 9)-(line 70,col 67)",
        "(line 71,col 9)-(line 71,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testBasicEncodeDecode()",
      "begin_line": 74,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 37)",
        "(line 76,col 9)-(line 76,col 37)",
        "(line 77,col 9)-(line 77,col 46)",
        "(line 78,col 9)-(line 78,col 87)",
        "(line 79,col 9)-(line 79,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testEncodeDecodeNull()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 84,col 80)",
        "(line 85,col 9)-(line 85,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testEncodeStringWithNull()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 37)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 92,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testDecodeStringWithNull()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 37)",
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 44)",
        "(line 99,col 9)-(line 99,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testEncodeObjects()",
      "begin_line": 102,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 37)",
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 64)",
        "(line 107,col 9)-(line 107,col 83)",
        "(line 109,col 9)-(line 109,col 53)",
        "(line 110,col 9)-(line 110,col 80)",
        "(line 112,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testInvalidEncoding()",
      "begin_line": 121,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodecTest.testDecodeObjects()",
      "begin_line": 137,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 37)",
        "(line 139,col 9)-(line 139,col 52)",
        "(line 140,col 9)-(line 140,col 64)",
        "(line 141,col 9)-(line 141,col 65)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 144,col 9)-(line 144,col 80)",
        "(line 146,col 9)-(line 152,col 9)"
      ]
    }
  ]
}