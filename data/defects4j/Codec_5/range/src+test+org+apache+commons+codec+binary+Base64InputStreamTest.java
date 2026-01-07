{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 366,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.Base64InputStreamTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 55,
      "end_line": 67,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 79)",
        "(line 57,col 9)-(line 57,col 70)",
        "(line 58,col 9)-(line 58,col 63)",
        "(line 61,col 9)-(line 61,col 83)",
        "(line 63,col 9)-(line 63,col 65)",
        "(line 64,col 9)-(line 66,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 68)",
        "(line 93,col 9)-(line 93,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 102,
      "end_line": 131,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 74)",
        "(line 105,col 9)-(line 105,col 66)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 109,col 9)-(line 109,col 55)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 68)",
        "(line 114,col 9)-(line 114,col 85)",
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 65)",
        "(line 119,col 9)-(line 119,col 90)",
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 125,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 139,
      "end_line": 168,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 74)",
        "(line 142,col 9)-(line 142,col 66)",
        "(line 143,col 9)-(line 143,col 71)",
        "(line 146,col 9)-(line 146,col 55)",
        "(line 147,col 9)-(line 147,col 39)",
        "(line 148,col 9)-(line 148,col 71)",
        "(line 151,col 9)-(line 151,col 85)",
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 68)",
        "(line 156,col 9)-(line 156,col 90)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 41)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 162,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 188,
      "end_line": 219,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 59)",
        "(line 192,col 9)-(line 192,col 67)",
        "(line 193,col 9)-(line 193,col 57)",
        "(line 195,col 9)-(line 195,col 43)",
        "(line 196,col 9)-(line 196,col 49)",
        "(line 197,col 9)-(line 197,col 78)",
        "(line 200,col 9)-(line 200,col 47)",
        "(line 201,col 9)-(line 201,col 39)",
        "(line 202,col 9)-(line 202,col 50)",
        "(line 204,col 9)-(line 204,col 43)",
        "(line 205,col 9)-(line 205,col 49)",
        "(line 206,col 9)-(line 206,col 78)",
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 216,col 9)-(line 216,col 43)",
        "(line 217,col 9)-(line 217,col 49)",
        "(line 218,col 9)-(line 218,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 239,
      "end_line": 279,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 67)",
        "(line 244,col 9)-(line 244,col 49)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 49)",
        "(line 251,col 9)-(line 251,col 78)",
        "(line 254,col 9)-(line 254,col 47)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 49)",
        "(line 263,col 9)-(line 263,col 78)",
        "(line 266,col 9)-(line 266,col 47)",
        "(line 267,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 43)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 278,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 286,
      "end_line": 292,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 66)",
        "(line 288,col 9)-(line 288,col 69)",
        "(line 289,col 9)-(line 289,col 88)",
        "(line 291,col 9)-(line 291,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 299,
      "end_line": 307,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 66)",
        "(line 301,col 9)-(line 301,col 36)",
        "(line 302,col 9)-(line 302,col 26)",
        "(line 303,col 9)-(line 303,col 69)",
        "(line 304,col 9)-(line 304,col 88)",
        "(line 305,col 9)-(line 305,col 39)",
        "(line 306,col 9)-(line 306,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 315,
      "end_line": 325,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 66)",
        "(line 317,col 9)-(line 317,col 69)",
        "(line 318,col 9)-(line 318,col 88)",
        "(line 319,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 332,
      "end_line": 365,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 66)",
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 336,col 88)",
        "(line 338,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 364,col 9)"
      ]
    }
  ]
}