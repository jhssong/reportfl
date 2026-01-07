{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 324,
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
      "begin_line": 65,
      "end_line": 76,
      "comment": "\n     * Register a ZipExtraField implementation.\n     *\n     * \u003cp\u003eThe given class must have a no-arg constructor and implement\n     * the {@link ZipExtraField ZipExtraField interface}.\u003c/p\u003e\n     * @param c the class to register\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * Create an instance of the appropriate ExtraField, falls back to\n     * {@link UnrecognizedExtraField UnrecognizedExtraField}.\n     * @param headerId the header identifier\n     * @return an instance of the appropriate ExtraField\n     * @throws InstantiationException if unable to instantiate the class\n     * @throws IllegalAccessException if not allowed to instantiate the class\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 57)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 70)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 94,col 9)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[])",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data as local file data, throwing an exception if the\n     * data cannot be parsed.\n     * @param data an array of bytes as it appears in local file data\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data, throwing an exception if the data cannot be parsed.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField)",
      "begin_line": 136,
      "end_line": 193,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @param onUnparseableData what to do if the extra field data\n     * cannot be parsed.\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 56)",
        "(line 140,col 9)-(line 140,col 22)",
        "(line 141,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 67)",
        "(line 192,col 9)-(line 192,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 200,
      "end_line": 232,
      "comment": "\n     * Merges the local file data fields of the given ZipExtraFields.\n     * @param data an array of ExtraFiles\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 202,col 74)",
        "(line 203,col 9)-(line 204,col 68)",
        "(line 206,col 9)-(line 206,col 48)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 22)",
        "(line 213,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 239,
      "end_line": 270,
      "comment": "\n     * Merges the central directory fields of the given ZipExtraFields.\n     * @param data an array of ExtraFields\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 241,col 74)",
        "(line 242,col 9)-(line 243,col 68)",
        "(line 245,col 9)-(line 245,col 48)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 44)",
        "(line 250,col 9)-(line 250,col 22)",
        "(line 251,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnparseableExtraField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 278,
      "end_line": 323,
      "comment": "\n     * \"enum\" for the possible actions to take if the extra field\n     * cannot be parsed.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROW_KEY"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n         * Key for \"throw an exception\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_KEY"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n         * Key for \"skip\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ_KEY"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n         * Key for \"read\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "THROW"
      ],
      "begin_line": 295,
      "end_line": 296,
      "comment": "\n         * Throw an exception if field cannot be parsed.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP"
      ],
      "begin_line": 302,
      "end_line": 303,
      "comment": "\n         * Skip the extra field entirely and don\u0027t make its data\n         * available - effectively removing the extra field data.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ"
      ],
      "begin_line": 309,
      "end_line": 310,
      "comment": "\n         * Read the extra field data into an instance of {@link\n         * UnparseableExtraFieldData UnparseableExtraFieldData}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.UnparseableExtraField(int)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.getKey()",
      "begin_line": 322,
      "end_line": 322,
      "comment": "\n         * Key of the action to take.\n         * @return the key\n         ",
      "child_ranges": [
        "(line 322,col 31)-(line 322,col 41)"
      ]
    }
  ]
}