{
  "filepath": "/tmp/Compress-13b/src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Zip64ExtendedInformationExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 76,
      "end_line": 356,
      "comment": "\n * Holds size and other extended information for entries that use Zip64\n * features.\n *\n * \u003cp\u003eFrom {@link \"http://www.pkware.com/documents/casestudies/APPNOTE.TXT PKWARE\u0027s APPNOTE.TXT\"}\n * \u003cpre\u003e\n * Zip64 Extended Information Extra Field (0x0001):\n *\n *          The following is the layout of the zip64 extended \n *          information \"extra\" block. If one of the size or\n *          offset fields in the Local or Central directory\n *          record is too small to hold the required data,\n *          a Zip64 extended information record is created.\n *          The order of the fields in the zip64 extended \n *          information record is fixed, but the fields will\n *          only appear if the corresponding Local or Central\n *          directory record field is set to 0xFFFF or 0xFFFFFFFF.\n *\n *          Note: all fields stored in Intel low-byte/high-byte order.\n *\n *          Value      Size       Description\n *          -----      ----       -----------\n *  (ZIP64) 0x0001     2 bytes    Tag for this \"extra\" block type\n *          Size       2 bytes    Size of this \"extra\" block\n *          Original \n *          Size       8 bytes    Original uncompressed file size\n *          Compressed\n *          Size       8 bytes    Size of compressed data\n *          Relative Header\n *          Offset     8 bytes    Offset of local header record\n *          Disk Start\n *          Number     4 bytes    Number of the disk on which\n *                                this file starts \n *\n *          This entry in the Local header must include BOTH original\n *          and compressed file size fields. If encrypting the \n *          central directory and bit 13 of the general purpose bit\n *          flag is set indicating masking, the value stored in the\n *          Local Header for the original file size will be zero.\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eCurrently Commons Compress doesn\u0027t support encrypting the\n * central directory so the not about masking doesn\u0027t apply.\u003c/p\u003e\n *\n * \u003cp\u003eThe implementation relies on data being read from the local file\n * header and assumes that both size values are always present.\u003c/p\u003e\n *\n * @since Apache Commons Compress 1.2\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_MUST_HAVE_BOTH_SIZES_MSG"
      ],
      "begin_line": 80,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "compressedSize",
        "relativeHeaderOffset"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diskStart"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawCentralDirectoryData"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Stored in {@link #parseFromCentralDirectoryData\n     * parseFromCentralDirectoryData} so it can be reused when ZipFile\n     * calls {@link #reparseCentralDirectoryData\n     * reparseCentralDirectoryData}.\n     *\n     * \u003cp\u003eNot used for anything else\u003c/p\u003e\n     *\n     * @since Apache Commons Compress 1.3\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField()",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * This constructor should only be used by the code that reads\n     * archives inside of Commons Compress.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Creates an extra field based on the original and compressed size.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * Creates an extra field based on all four possible values.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 25)",
        "(line 131,col 9)-(line 131,col 45)",
        "(line 132,col 9)-(line 132,col 57)",
        "(line 133,col 9)-(line 133,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getHeaderId()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataLength()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryLength()",
      "begin_line": 147,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData()",
      "begin_line": 155,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData()",
      "begin_line": 168,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 71)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 183,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 55)",
        "(line 196,col 9)-(line 196,col 24)",
        "(line 197,col 9)-(line 197,col 65)",
        "(line 198,col 9)-(line 198,col 24)",
        "(line 199,col 9)-(line 199,col 43)",
        "(line 200,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 213,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 218,col 77)",
        "(line 226,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.reparseCentralDirectoryData(boolean, boolean, boolean, boolean)",
      "begin_line": 248,
      "end_line": 286,
      "comment": "\n     * Parses the raw bytes read from the central directory extra\n     * field with knowledge which fields are expected to be there.\n     *\n     * \u003cp\u003eAll four fields inside the zip64 extended information extra\n     * field are optional and only present if their corresponding\n     * entry inside the central directory contains the correct magic\n     * value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getSize()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCompressedSize()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * The compressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getRelativeHeaderOffset()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getDiskStartNumber()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(byte[])",
      "begin_line": 344,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 20)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 19)"
      ]
    }
  ]
}