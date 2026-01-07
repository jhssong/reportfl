{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 323,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "implementations"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Static registry of known extra fields.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.register(java.lang.Class\u003c?\u003e)",
      "begin_line": 64,
      "end_line": 75,
      "comment": "\n     * Register a ZipExtraField implementation.\n     *\n     * \u003cp\u003eThe given class must have a no-arg constructor and implement\n     * the {@link ZipExtraField ZipExtraField interface}.\u003c/p\u003e\n     * @param c the class to register\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * Create an instance of the appropriate ExtraField, falls back to\n     * {@link UnrecognizedExtraField UnrecognizedExtraField}.\n     * @param headerId the header identifier\n     * @return an instance of the appropriate ExtraField\n     * @throws InstantiationException if unable to instantiate the class\n     * @throws IllegalAccessException if not allowed to instantiate the class\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 57)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 70)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[])",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data as local file data, throwing an exception if the\n     * data cannot be parsed.\n     * @param data an array of bytes as it appears in local file data\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data, throwing an exception if the data cannot be parsed.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField)",
      "begin_line": 135,
      "end_line": 192,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @param onUnparseableData what to do if the extra field data\n     * cannot be parsed.\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 56)",
        "(line 139,col 9)-(line 139,col 22)",
        "(line 140,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 67)",
        "(line 191,col 9)-(line 191,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 199,
      "end_line": 231,
      "comment": "\n     * Merges the local file data fields of the given ZipExtraFields.\n     * @param data an array of ExtraFiles\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 201,col 74)",
        "(line 202,col 9)-(line 203,col 68)",
        "(line 205,col 9)-(line 205,col 48)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 211,col 9)-(line 211,col 22)",
        "(line 212,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 238,
      "end_line": 269,
      "comment": "\n     * Merges the central directory fields of the given ZipExtraFields.\n     * @param data an array of ExtraFields\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 240,col 74)",
        "(line 241,col 9)-(line 242,col 68)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 22)",
        "(line 250,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnparseableExtraField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 277,
      "end_line": 322,
      "comment": "\n     * \"enum\" for the possible actions to take if the extra field\n     * cannot be parsed.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROW_KEY"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n         * Key for \"throw an exception\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_KEY"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": "\n         * Key for \"skip\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ_KEY"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n         * Key for \"read\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "THROW"
      ],
      "begin_line": 294,
      "end_line": 295,
      "comment": "\n         * Throw an exception if field cannot be parsed.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP"
      ],
      "begin_line": 301,
      "end_line": 302,
      "comment": "\n         * Skip the extra field entirely and don\u0027t make its data\n         * available - effectively removing the extra field data.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ"
      ],
      "begin_line": 308,
      "end_line": 309,
      "comment": "\n         * Read the extra field data into an instance of {@link\n         * UnparseableExtraFieldData UnparseableExtraFieldData}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.UnparseableExtraField(int)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.getKey()",
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n         * Key of the action to take.\n         * @return the key\n         ",
      "child_ranges": [
        "(line 321,col 31)-(line 321,col 41)"
      ]
    }
  ]
}