{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/binary/Base64TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 222,
      "comment": "\n * This random data was encoded by OpenSSL. Java had nothing to do with it. This data helps us test interop between\n * Commons-Codec and OpenSSL. Notice that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_101_MULTIPLE_OF_3"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_98_NPE"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_98_NPE_DECODED"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_64_CHARS_PER_LINE"
      ],
      "begin_line": 45,
      "end_line": 67,
      "comment": " to further parameterize commons-codec to support this pointless variation."
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_76_CHARS_PER_LINE"
      ],
      "begin_line": 69,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECODED"
      ],
      "begin_line": 89,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream, byte[])",
      "begin_line": 147,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 170,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 61)",
        "(line 173,col 9)-(line 173,col 28)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.resizeArray(byte[])",
      "begin_line": 186,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 62)",
        "(line 188,col 9)-(line 188,col 65)",
        "(line 189,col 9)-(line 189,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.randomData(int, boolean)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * Returns an encoded and decoded copy of the same random data.\n     *\n     * @param size amount of random data to generate and encode\n     * @param urlSafe true if encoding be urlSafe\n     * @return two byte[] arrays:  [0] \u003d decoded, [1] \u003d encoded\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 38)",
        "(line 202,col 9)-(line 202,col 46)",
        "(line 203,col 9)-(line 203,col 29)",
        "(line 204,col 9)-(line 204,col 108)",
        "(line 205,col 9)-(line 205,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.bytesContain(byte[], byte)",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\n     * Tests the supplied byte[] array to see if it contains the specified byte c.\n     *\n     * @param bytes byte[] array to test\n     * @param c byte to look for\n     * @return true if bytes contains c, false otherwise\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 21)"
      ]
    }
  ]
}