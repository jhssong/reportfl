{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/net/QCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QCodecTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 207,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 35,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 39,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodecTest.QCodecTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.constructString(int[])",
      "begin_line": 48,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 49)",
        "(line 50,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testNullInput()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 37)",
        "(line 60,col 9)-(line 60,col 44)",
        "(line 61,col 9)-(line 61,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testUTF8RoundTrip()",
      "begin_line": 64,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 63)",
        "(line 67,col 9)-(line 67,col 68)",
        "(line 69,col 9)-(line 69,col 55)",
        "(line 71,col 9)-(line 74,col 10)",
        "(line 75,col 9)-(line 75,col 88)",
        "(line 77,col 9)-(line 77,col 67)",
        "(line 78,col 9)-(line 78,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testBasicEncodeDecode()",
      "begin_line": 82,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 87,col 62)",
        "(line 88,col 9)-(line 89,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testUnsafeEncodeDecode()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 37)",
        "(line 94,col 9)-(line 94,col 33)",
        "(line 95,col 9)-(line 95,col 46)",
        "(line 96,col 9)-(line 97,col 52)",
        "(line 98,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeDecodeNull()",
      "begin_line": 102,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 37)",
        "(line 104,col 9)-(line 105,col 41)",
        "(line 106,col 9)-(line 107,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeStringWithNull()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 27)",
        "(line 113,col 9)-(line 113,col 57)",
        "(line 114,col 9)-(line 114,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testDecodeStringWithNull()",
      "begin_line": 117,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 27)",
        "(line 120,col 9)-(line 120,col 46)",
        "(line 121,col 9)-(line 121,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeObjects()",
      "begin_line": 125,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 64)",
        "(line 129,col 9)-(line 130,col 46)",
        "(line 132,col 9)-(line 132,col 53)",
        "(line 133,col 9)-(line 133,col 81)",
        "(line 135,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testInvalidEncoding()",
      "begin_line": 145,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 47)",
        "(line 147,col 13)-(line 152,col 13)",
        "(line 153,col 13)-(line 158,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testDecodeObjects()",
      "begin_line": 161,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 37)",
        "(line 163,col 9)-(line 163,col 49)",
        "(line 164,col 9)-(line 164,col 64)",
        "(line 165,col 9)-(line 166,col 30)",
        "(line 168,col 9)-(line 168,col 53)",
        "(line 169,col 9)-(line 169,col 81)",
        "(line 171,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testEncodeDecodeBlanks()",
      "begin_line": 181,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 49)",
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 64)",
        "(line 185,col 9)-(line 185,col 37)",
        "(line 186,col 9)-(line 186,col 38)",
        "(line 187,col 9)-(line 187,col 40)",
        "(line 188,col 9)-(line 188,col 75)",
        "(line 189,col 9)-(line 189,col 37)",
        "(line 190,col 9)-(line 190,col 33)",
        "(line 191,col 9)-(line 191,col 75)",
        "(line 192,col 9)-(line 192,col 36)",
        "(line 193,col 9)-(line 193,col 72)",
        "(line 194,col 9)-(line 194,col 36)",
        "(line 195,col 9)-(line 195,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodecTest.testLetUsMakeCloverHappy()",
      "begin_line": 199,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 37)",
        "(line 202,col 9)-(line 202,col 44)",
        "(line 203,col 9)-(line 203,col 38)",
        "(line 204,col 9)-(line 204,col 45)"
      ]
    }
  ]
}