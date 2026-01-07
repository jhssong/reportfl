{
  "filepath": "/tmp/Codec-2b/src/test/org/apache/commons/codec/net/QCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QCodecTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 206,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 38,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodecTest.QCodecTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.constructString(int[])",
      "begin_line": 47,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 49)",
        "(line 49,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testNullInput()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 44)",
        "(line 60,col 9)-(line 60,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testUTF8RoundTrip()",
      "begin_line": 63,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 66,col 68)",
        "(line 68,col 9)-(line 68,col 44)",
        "(line 70,col 9)-(line 73,col 10)",
        "(line 74,col 9)-(line 74,col 88)",
        "(line 76,col 9)-(line 76,col 67)",
        "(line 77,col 9)-(line 77,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testBasicEncodeDecode()",
      "begin_line": 81,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 45)",
        "(line 84,col 9)-(line 84,col 46)",
        "(line 85,col 9)-(line 86,col 62)",
        "(line 87,col 9)-(line 88,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testUnsafeEncodeDecode()",
      "begin_line": 91,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 96,col 52)",
        "(line 97,col 9)-(line 98,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeDecodeNull()",
      "begin_line": 101,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 37)",
        "(line 103,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 106,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeStringWithNull()",
      "begin_line": 109,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 57)",
        "(line 113,col 9)-(line 113,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testDecodeStringWithNull()",
      "begin_line": 116,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 27)",
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 120,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeObjects()",
      "begin_line": 124,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 37)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 64)",
        "(line 128,col 9)-(line 129,col 46)",
        "(line 131,col 9)-(line 131,col 53)",
        "(line 132,col 9)-(line 132,col 81)",
        "(line 134,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testInvalidEncoding()",
      "begin_line": 144,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 13)-(line 151,col 13)",
        "(line 152,col 13)-(line 157,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testDecodeObjects()",
      "begin_line": 160,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 49)",
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 165,col 30)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 168,col 81)",
        "(line 170,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeDecodeBlanks()",
      "begin_line": 180,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 49)",
        "(line 182,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 37)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 187,col 75)",
        "(line 188,col 9)-(line 188,col 37)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 75)",
        "(line 191,col 9)-(line 191,col 36)",
        "(line 192,col 9)-(line 192,col 72)",
        "(line 193,col 9)-(line 193,col 36)",
        "(line 194,col 9)-(line 194,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testLetUsMakeCloverHappy()",
      "begin_line": 198,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 37)",
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 44)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 45)"
      ]
    }
  ]
}