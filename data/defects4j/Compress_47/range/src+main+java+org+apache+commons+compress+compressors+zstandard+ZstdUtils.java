{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/zstandard/ZstdUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZstdUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 140,
      "comment": "\n * Utility code for the Zstandard compression format.\n * @ThreadSafe\n * @since 1.16\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZSTANDARD_FRAME_MAGIC"
      ],
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Zstandard Frame Magic Bytes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SKIPPABLE_FRAME_MAGIC"
      ],
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Skippable Frame Magic Bytes - the three common bytes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cachedZstdAvailability"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdUtils.ZstdUtils()",
      "begin_line": 58,
      "end_line": 59,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdUtils.isZstdCompressionAvailable()",
      "begin_line": 65,
      "end_line": 71,
      "comment": "\n     * Are the classes required to support Zstandard compression available?\n     * @return true if the classes required to support Zstandard compression are available\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 71)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdUtils.internalIsZstdCompressionAvailable()",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdUtils.setCacheZstdAvailablity(boolean)",
      "begin_line": 88,
      "end_line": 96,
      "comment": "\n     * Whether to cache the result of the Zstandard for Java check.\n     *\n     * \u003cp\u003eThis defaults to {@code false} in an OSGi environment and {@code true} otherwise.\u003c/p\u003e\n     * @param doCache whether to cache the result\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdUtils.matches(byte[], int)",
      "begin_line": 106,
      "end_line": 134,
      "comment": "\n     * Checks if the signature matches what is expected for a Zstandard file.\n     *\n     * @param   signature     the bytes to check\n     * @param   length        the number of bytes to check\n     * @return true if signature matches the Ztstandard or skippable\n     * frame magic bytes, false otherwise\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.zstandard.ZstdUtils.getCachedZstdAvailability()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " only exists to support unit tests",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 38)"
      ]
    }
  ]
}