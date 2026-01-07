{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/binary/Base64TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 221,
      "comment": "\n * This random data was encoded by OpenSSL. Java had nothing to do with it. This data helps us test interop between\n * Commons-Codec and OpenSSL. Notice that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_98_NPE"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_98_NPE_DECODED"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_64_CHARS_PER_LINE"
      ],
      "begin_line": 44,
      "end_line": 66,
      "comment": " to further parameterize commons-codec to support this pointless variation."
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_76_CHARS_PER_LINE"
      ],
      "begin_line": 68,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECODED"
      ],
      "begin_line": 88,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream, byte[])",
      "begin_line": 146,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 169,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 61)",
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.resizeArray(byte[])",
      "begin_line": 185,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 56)",
        "(line 187,col 9)-(line 187,col 65)",
        "(line 188,col 9)-(line 188,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.randomData(int, boolean)",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * Returns an encoded and decoded copy of the same random data.\n     * \n     * @param size amount of random data to generate and encode\n     * @param urlSafe true if encoding be urlSafe\n     * @return two byte[] arrays:  [0] \u003d decoded, [1] \u003d encoded \n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)",
        "(line 201,col 9)-(line 201,col 40)",
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 203,col 102)",
        "(line 204,col 9)-(line 204,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.bytesContain(byte[], byte)",
      "begin_line": 214,
      "end_line": 219,
      "comment": "\n     * Tests the supplied byte[] array to see if it contains the specified byte c.\n     *\n     * @param bytes byte[] array to test\n     * @param c byte to look for\n     * @return true if bytes contains c, false otherwise\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 21)"
      ]
    }
  ]
}