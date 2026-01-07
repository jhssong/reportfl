{
  "filepath": "/tmp/Codec-6b/src/test/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 384,
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
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec101()",
      "begin_line": 55,
      "end_line": 65,
      "comment": "\n     * Test for the CODEC-101 bug:  InputStream.read(byte[]) should never return 0\n     * because Java\u0027s builtin InputStreamReader hates that.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 91)",
        "(line 57,col 9)-(line 57,col 71)",
        "(line 58,col 9)-(line 58,col 59)",
        "(line 59,col 9)-(line 59,col 39)",
        "(line 60,col 9)-(line 60,col 32)",
        "(line 61,col 9)-(line 61,col 75)",
        "(line 63,col 9)-(line 63,col 28)",
        "(line 64,col 9)-(line 64,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 73,
      "end_line": 85,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 79)",
        "(line 75,col 9)-(line 75,col 70)",
        "(line 76,col 9)-(line 76,col 63)",
        "(line 79,col 9)-(line 79,col 83)",
        "(line 81,col 9)-(line 81,col 65)",
        "(line 82,col 9)-(line 84,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 42)",
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 110,col 68)",
        "(line 111,col 9)-(line 111,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 120,
      "end_line": 149,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 74)",
        "(line 123,col 9)-(line 123,col 66)",
        "(line 124,col 9)-(line 124,col 68)",
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 68)",
        "(line 132,col 9)-(line 132,col 85)",
        "(line 133,col 9)-(line 133,col 41)",
        "(line 134,col 9)-(line 134,col 65)",
        "(line 137,col 9)-(line 137,col 90)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 139,col 41)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 143,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 157,
      "end_line": 186,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 74)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 71)",
        "(line 164,col 9)-(line 164,col 55)",
        "(line 165,col 9)-(line 165,col 39)",
        "(line 166,col 9)-(line 166,col 71)",
        "(line 169,col 9)-(line 169,col 85)",
        "(line 170,col 9)-(line 170,col 41)",
        "(line 171,col 9)-(line 171,col 68)",
        "(line 174,col 9)-(line 174,col 90)",
        "(line 175,col 9)-(line 175,col 55)",
        "(line 176,col 9)-(line 176,col 41)",
        "(line 177,col 9)-(line 177,col 48)",
        "(line 180,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 206,
      "end_line": 237,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 67)",
        "(line 211,col 9)-(line 211,col 57)",
        "(line 213,col 9)-(line 213,col 43)",
        "(line 214,col 9)-(line 214,col 49)",
        "(line 215,col 9)-(line 215,col 78)",
        "(line 218,col 9)-(line 218,col 47)",
        "(line 219,col 9)-(line 219,col 39)",
        "(line 220,col 9)-(line 220,col 50)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 224,col 9)-(line 224,col 78)",
        "(line 227,col 9)-(line 227,col 47)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 50)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 235,col 49)",
        "(line 236,col 9)-(line 236,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 257,
      "end_line": 297,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 59)",
        "(line 261,col 9)-(line 261,col 67)",
        "(line 262,col 9)-(line 262,col 49)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 268,col 9)-(line 268,col 49)",
        "(line 269,col 9)-(line 269,col 78)",
        "(line 272,col 9)-(line 272,col 47)",
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 274,col 42)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 43)",
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 281,col 78)",
        "(line 284,col 9)-(line 284,col 47)",
        "(line 285,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 42)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 43)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 296,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 304,
      "end_line": 310,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 66)",
        "(line 306,col 9)-(line 306,col 69)",
        "(line 307,col 9)-(line 307,col 88)",
        "(line 309,col 9)-(line 309,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 317,
      "end_line": 325,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 66)",
        "(line 319,col 9)-(line 319,col 36)",
        "(line 320,col 9)-(line 320,col 26)",
        "(line 321,col 9)-(line 321,col 69)",
        "(line 322,col 9)-(line 322,col 88)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 333,
      "end_line": 343,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 66)",
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 336,col 88)",
        "(line 337,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 350,
      "end_line": 383,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 66)",
        "(line 352,col 9)-(line 352,col 36)",
        "(line 353,col 9)-(line 353,col 69)",
        "(line 354,col 9)-(line 354,col 88)",
        "(line 356,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 382,col 9)"
      ]
    }
  ]
}