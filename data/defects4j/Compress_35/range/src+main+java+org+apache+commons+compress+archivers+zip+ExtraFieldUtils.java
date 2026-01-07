{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 325,
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
      "comment": "\n     * Create an instance of the appropriate ExtraField, falls back to\n     * {@link UnrecognizedExtraField UnrecognizedExtraField}.\n     * @param headerId the header identifier\n     * @return an instance of the appropriate ExtraField\n     * @exception InstantiationException if unable to instantiate the class\n     * @exception IllegalAccessException if not allowed to instantiate the class\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 51)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 64)",
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
      "end_line": 194,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @param onUnparseableData what to do if the extra field data\n     * cannot be parsed.\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 63)",
        "(line 139,col 9)-(line 139,col 22)",
        "(line 140,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 193,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 201,
      "end_line": 233,
      "comment": "\n     * Merges the local file data fields of the given ZipExtraFields.\n     * @param data an array of ExtraFiles\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 203,col 74)",
        "(line 204,col 9)-(line 205,col 68)",
        "(line 207,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 38)",
        "(line 213,col 9)-(line 213,col 22)",
        "(line 214,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 240,
      "end_line": 271,
      "comment": "\n     * Merges the central directory fields of the given ZipExtraFields.\n     * @param data an array of ExtraFields\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 242,col 74)",
        "(line 243,col 9)-(line 244,col 68)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 38)",
        "(line 251,col 9)-(line 251,col 22)",
        "(line 252,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnparseableExtraField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 279,
      "end_line": 324,
      "comment": "\n     * \"enum\" for the possible actions to take if the extra field\n     * cannot be parsed.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROW_KEY"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n         * Key for \"throw an exception\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_KEY"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": "\n         * Key for \"skip\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ_KEY"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n         * Key for \"read\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "THROW"
      ],
      "begin_line": 296,
      "end_line": 297,
      "comment": "\n         * Throw an exception if field cannot be parsed.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP"
      ],
      "begin_line": 303,
      "end_line": 304,
      "comment": "\n         * Skip the extra field entirely and don\u0027t make its data\n         * available - effectively removing the extra field data.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ"
      ],
      "begin_line": 310,
      "end_line": 311,
      "comment": "\n         * Read the extra field data into an instance of {@link\n         * UnparseableExtraFieldData UnparseableExtraFieldData}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.UnparseableExtraField(int)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.getKey()",
      "begin_line": 323,
      "end_line": 323,
      "comment": "\n         * Key of the action to take.\n         * @return the key\n         ",
      "child_ranges": [
        "(line 323,col 31)-(line 323,col 41)"
      ]
    }
  ]
}