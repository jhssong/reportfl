{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/binary/Base64OutputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 350,
      "comment": "\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testCodec98NPE()",
      "begin_line": 48,
      "end_line": 63,
      "comment": "\n     * Test the Base64OutputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 85)",
        "(line 51,col 9)-(line 51,col 51)",
        "(line 52,col 9)-(line 52,col 70)",
        "(line 53,col 9)-(line 53,col 75)",
        "(line 54,col 9)-(line 54,col 78)",
        "(line 55,col 9)-(line 55,col 44)",
        "(line 56,col 9)-(line 56,col 23)",
        "(line 58,col 9)-(line 58,col 55)",
        "(line 59,col 9)-(line 59,col 71)",
        "(line 60,col 9)-(line 62,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStreamMimeChunkSize()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStreamPemChunkSize()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStream(int)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 91,col 68)",
        "(line 92,col 9)-(line 92,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByChunk()",
      "begin_line": 101,
      "end_line": 131,
      "comment": "\n     * Test the Base64OutputStream implementation\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 74)",
        "(line 105,col 9)-(line 105,col 66)",
        "(line 106,col 9)-(line 106,col 72)",
        "(line 109,col 9)-(line 109,col 55)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 72)",
        "(line 114,col 9)-(line 114,col 85)",
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 69)",
        "(line 119,col 9)-(line 119,col 96)",
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 125,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByteByByte()",
      "begin_line": 139,
      "end_line": 169,
      "comment": "\n     * Test the Base64OutputStream implementation\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 74)",
        "(line 143,col 9)-(line 143,col 66)",
        "(line 144,col 9)-(line 144,col 51)",
        "(line 147,col 9)-(line 147,col 55)",
        "(line 148,col 9)-(line 148,col 39)",
        "(line 149,col 9)-(line 149,col 51)",
        "(line 152,col 9)-(line 152,col 85)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 49)",
        "(line 157,col 9)-(line 157,col 96)",
        "(line 158,col 9)-(line 158,col 55)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 48)",
        "(line 163,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 189,
      "end_line": 219,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     *\n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param separator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 68)",
        "(line 193,col 9)-(line 193,col 87)",
        "(line 194,col 9)-(line 194,col 27)",
        "(line 195,col 9)-(line 195,col 20)",
        "(line 196,col 9)-(line 196,col 46)",
        "(line 197,col 9)-(line 197,col 86)",
        "(line 200,col 9)-(line 200,col 46)",
        "(line 201,col 9)-(line 201,col 53)",
        "(line 202,col 9)-(line 202,col 27)",
        "(line 203,col 9)-(line 203,col 20)",
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 205,col 86)",
        "(line 208,col 9)-(line 208,col 46)",
        "(line 209,col 9)-(line 209,col 22)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 27)",
        "(line 215,col 9)-(line 215,col 20)",
        "(line 216,col 9)-(line 216,col 39)",
        "(line 218,col 9)-(line 218,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 239,
      "end_line": 286,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     *\n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param separator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 68)",
        "(line 243,col 9)-(line 243,col 87)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)",
        "(line 248,col 9)-(line 248,col 46)",
        "(line 249,col 9)-(line 249,col 91)",
        "(line 252,col 9)-(line 252,col 46)",
        "(line 253,col 9)-(line 253,col 53)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 20)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 91)",
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 263,col 53)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 20)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 270,col 99)",
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 274,col 22)",
        "(line 275,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 20)",
        "(line 283,col 9)-(line 283,col 39)",
        "(line 285,col 9)-(line 285,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteOutOfBounds()",
      "begin_line": 294,
      "end_line": 328,
      "comment": "\n     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 71)",
        "(line 298,col 9)-(line 298,col 68)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteToNullCoverage()",
      "begin_line": 336,
      "end_line": 348,
      "comment": "\n     * Tests Base64OutputStream.write(null).\n     *\n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 71)",
        "(line 339,col 9)-(line 339,col 68)",
        "(line 340,col 9)-(line 347,col 9)"
      ]
    }
  ]
}