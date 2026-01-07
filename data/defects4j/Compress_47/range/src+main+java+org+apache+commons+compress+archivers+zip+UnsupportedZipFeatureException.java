{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/UnsupportedZipFeatureException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnsupportedZipFeatureException",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipException"
      ],
      "begin_line": 28,
      "end_line": 134,
      "comment": "\n * Exception thrown when attempting to read or write data for a zip\n * entry that uses ZIP features not supported by this library.\n * @since 1.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "reason"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 39,
      "end_line": 45,
      "comment": "\n     * Creates an exception.\n     * @param reason the feature that is not supported\n     * @param entry the entry using the feature\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 42,col 33)",
        "(line 43,col 9)-(line 43,col 29)",
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.ZipMethod, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     * Creates an exception for archives that use an unsupported\n     * compression algorithm.\n     * @param method the method that is not supported\n     * @param entry the entry using the feature\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 57,col 55)",
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Creates an exception when the whole archive uses an unsupported\n     * feature.\n     *\n     * @param reason the feature that is not supported\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 70)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.getFeature()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * The unsupported feature that has been used.\n     * @return The unsupported feature that has been used.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.getEntry()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * The entry using the unsupported feature.\n     * @return The entry using the unsupported feature.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Feature",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 95,
      "end_line": 133,
      "comment": "\n     * ZIP Features that may or may not be supported.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENCRYPTION"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n         * The entry is encrypted.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n         * The entry used an unsupported compression method.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "DATA_DESCRIPTOR"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n         * The entry uses a data descriptor.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SPLITTING"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n         * The archive uses splitting or spanning.\n         * @since 1.5\n         "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_COMPRESSED_SIZE"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n         * The archive contains entries with unknown compressed size\n         * for a compression method that doesn\u0027t support detection of\n         * the end of the compressed stream.\n         * @since 1.16\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.Feature(java.lang.String)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.toString()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 24)"
      ]
    }
  ]
}