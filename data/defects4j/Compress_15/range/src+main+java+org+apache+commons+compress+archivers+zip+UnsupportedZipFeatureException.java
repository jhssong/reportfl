{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/zip/UnsupportedZipFeatureException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnsupportedZipFeatureException",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipException"
      ],
      "begin_line": 28,
      "end_line": 90,
      "comment": "\n * Exception thrown when attempting to read or write data for a zip\n * entry that uses ZIP features not supported by this library.\n * @since Commons Compress 1.1\n "
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
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.getFeature()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * The unsupported feature that has been used.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.getEntry()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * The entry using the unsupported feature.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Feature",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 65,
      "end_line": 89,
      "comment": "\n     * ZIP Features that may or may not be supported.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ENCRYPTION"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n         * The entry is encrypted.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n         * The entry used an unsupported compression method.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "DATA_DESCRIPTOR"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n         * The entry uses a data descriptor.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.Feature(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.toString()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 24)"
      ]
    }
  ]
}