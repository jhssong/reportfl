{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/zip/UnsupportedZipFeatureException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnsupportedZipFeatureException",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipException"
      ],
      "begin_line": 28,
      "end_line": 88,
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.UnsupportedZipFeatureException(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 38,
      "end_line": 44,
      "comment": "\n     * Creates an exception.\n     * @param reason the feature that is not supported\n     * @param entry the entry using the feature\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 41,col 33)",
        "(line 42,col 9)-(line 42,col 29)",
        "(line 43,col 9)-(line 43,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.getFeature()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * The unsupported feature that has been used.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.getEntry()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * The entry using the unsupported feature.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Feature",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 87,
      "comment": "\n     * ZIP Features that may or may not be supported.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ENCRYPTION"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n         * The entry is encrypted.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n         * The entry used an unsupported compression method.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "DATA_DESCRIPTOR"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n         * The entry uses a data descriptor.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.Feature(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.toString()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 24)"
      ]
    }
  ]
}