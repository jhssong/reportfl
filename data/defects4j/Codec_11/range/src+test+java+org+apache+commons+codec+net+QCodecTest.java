{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/net/QCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QCodecTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 220,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 40,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 44,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.constructString(int[])",
      "begin_line": 49,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 49)",
        "(line 51,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testNullInput()",
      "begin_line": 59,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 37)",
        "(line 62,col 9)-(line 62,col 44)",
        "(line 63,col 9)-(line 63,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testUTF8RoundTrip()",
      "begin_line": 66,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 63)",
        "(line 70,col 9)-(line 70,col 68)",
        "(line 72,col 9)-(line 72,col 55)",
        "(line 74,col 9)-(line 77,col 10)",
        "(line 78,col 9)-(line 78,col 88)",
        "(line 80,col 9)-(line 80,col 67)",
        "(line 81,col 9)-(line 81,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testBasicEncodeDecode()",
      "begin_line": 85,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 45)",
        "(line 89,col 9)-(line 89,col 46)",
        "(line 90,col 9)-(line 91,col 62)",
        "(line 92,col 9)-(line 93,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testUnsafeEncodeDecode()",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 46)",
        "(line 101,col 9)-(line 102,col 52)",
        "(line 103,col 9)-(line 104,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeDecodeNull()",
      "begin_line": 107,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)",
        "(line 110,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 113,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeStringWithNull()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 27)",
        "(line 120,col 9)-(line 120,col 57)",
        "(line 121,col 9)-(line 121,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testDecodeStringWithNull()",
      "begin_line": 124,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 129,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeObjects()",
      "begin_line": 133,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 37)",
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 137,col 64)",
        "(line 138,col 9)-(line 139,col 46)",
        "(line 141,col 9)-(line 141,col 53)",
        "(line 142,col 9)-(line 142,col 81)",
        "(line 144,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testInvalidEncoding()",
      "begin_line": 154,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 47)",
        "(line 157,col 13)-(line 162,col 13)",
        "(line 163,col 13)-(line 168,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testDecodeObjects()",
      "begin_line": 171,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 37)",
        "(line 174,col 9)-(line 174,col 49)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 176,col 9)-(line 177,col 30)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 81)",
        "(line 182,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeDecodeBlanks()",
      "begin_line": 192,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 64)",
        "(line 196,col 9)-(line 196,col 64)",
        "(line 197,col 9)-(line 197,col 37)",
        "(line 198,col 9)-(line 198,col 38)",
        "(line 199,col 9)-(line 199,col 40)",
        "(line 200,col 9)-(line 200,col 75)",
        "(line 201,col 9)-(line 201,col 37)",
        "(line 202,col 9)-(line 202,col 33)",
        "(line 203,col 9)-(line 203,col 75)",
        "(line 204,col 9)-(line 204,col 36)",
        "(line 205,col 9)-(line 205,col 72)",
        "(line 206,col 9)-(line 206,col 36)",
        "(line 207,col 9)-(line 207,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testLetUsMakeCloverHappy()",
      "begin_line": 211,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 215,col 44)",
        "(line 216,col 9)-(line 216,col 38)",
        "(line 217,col 9)-(line 217,col 45)"
      ]
    }
  ]
}