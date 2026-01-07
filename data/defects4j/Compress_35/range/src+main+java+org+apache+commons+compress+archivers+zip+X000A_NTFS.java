{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X000A_NTFS",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 63,
      "end_line": 385,
      "comment": "\n * NTFS extra field that was thought to store various attributes but\n * in reality only stores timestamps.\n *\n * \u003cpre\u003e\n *    4.5.5 -NTFS Extra Field (0x000a):\n *\n *       The following is the layout of the NTFS attributes\n *       \"extra\" block. (Note: At this time the Mtime, Atime\n *       and Ctime values MAY be used on any WIN32 system.)\n *\n *       Note: all fields stored in Intel low-byte/high-byte order.\n *\n *         Value      Size       Description\n *         -----      ----       -----------\n * (NTFS)  0x000a     2 bytes    Tag for this \"extra\" block type\n *         TSize      2 bytes    Size of the total \"extra\" block\n *         Reserved   4 bytes    Reserved for future use\n *         Tag1       2 bytes    NTFS attribute tag value #1\n *         Size1      2 bytes    Size of attribute #1, in bytes\n *         (var)      Size1      Attribute #1 data\n *          .\n *          .\n *          .\n *          TagN       2 bytes    NTFS attribute tag value #N\n *          SizeN      2 bytes    Size of attribute #N, in bytes\n *          (var)      SizeN      Attribute #N data\n *\n *        For NTFS, values for Tag1 through TagN are as follows:\n *        (currently only one set of attributes is defined for NTFS)\n *\n *          Tag        Size       Description\n *          -----      ----       -----------\n *          0x0001     2 bytes    Tag for attribute #1\n *          Size1      2 bytes    Size of attribute #1, in bytes\n *          Mtime      8 bytes    File last modification time\n *          Atime      8 bytes    File last access time\n *          Ctime      8 bytes    File creation time\n * \u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TIME_ATTR_TAG"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TIME_ATTR_SIZE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifyTime"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessTime"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createTime"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getHeaderId()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getLocalFileDataLength()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 91,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCentralDirectoryLength()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * \u003cp\u003eFor X5455 the central length is often smaller than the\n     * local length, because central cannot contain access or create\n     * timestamps.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getLocalFileDataData()",
      "begin_line": 114,
      "end_line": 127,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 68)",
        "(line 116,col 9)-(line 116,col 20)",
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 17)",
        "(line 119,col 9)-(line 119,col 69)",
        "(line 120,col 9)-(line 120,col 17)",
        "(line 121,col 9)-(line 121,col 65)",
        "(line 122,col 9)-(line 122,col 17)",
        "(line 123,col 9)-(line 123,col 65)",
        "(line 124,col 9)-(line 124,col 17)",
        "(line 125,col 9)-(line 125,col 65)",
        "(line 126,col 9)-(line 126,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCentralDirectoryData()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return the central directory data\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 147,
      "end_line": 165,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 40)",
        "(line 153,col 9)-(line 153,col 20)",
        "(line 155,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same parsing logic for both central directory and local file data.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 16)",
        "(line 175,col 9)-(line 175,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getModifyTime()",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Returns the \"File last modification time\" of this zip entry as\n     * a ZipEightByteInteger object, or {@link\n     * ZipEightByteInteger#ZERO} if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return File last modification time\n     ",
      "child_ranges": [
        "(line 186,col 50)-(line 186,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getAccessTime()",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Returns the \"File last access time\" of this zip entry as a\n     * ZipEightByteInteger object, or {@link ZipEightByteInteger#ZERO}\n     * if no such timestamp exists in the zip entry.\n     *\n     * @return File last access time\n     ",
      "child_ranges": [
        "(line 195,col 50)-(line 195,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCreateTime()",
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * Returns the \"File creation time\" of this zip entry as a\n     * ZipEightByteInteger object, or {@link ZipEightByteInteger#ZERO}\n     * if no such timestamp exists in the zip entry.\n     *\n     * @return File creation time\n     ",
      "child_ranges": [
        "(line 204,col 50)-(line 204,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getModifyJavaTime()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns the modify time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     *\n     * @return modify time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getAccessJavaTime()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the access time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     *\n     * @return access time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCreateJavaTime()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the create time as a a java.util.Date of this zip\n     * entry, or null if no such timestamp exists in the zip entry.\n     *\n     * @return create time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setModifyTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Sets the File last modification time of this zip entry using a\n     * ZipEightByteInteger object.\n     *\n     * @param t ZipEightByteInteger of the modify time\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setAccessTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Sets the File last access time of this zip entry using a\n     * ZipEightByteInteger object.\n     *\n     * @param t ZipEightByteInteger of the access time\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setCreateTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Sets the File creation time of this zip entry using a\n     * ZipEightByteInteger object.\n     *\n     * @param t ZipEightByteInteger of the create time\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setModifyJavaTime(java.util.Date)",
      "begin_line": 271,
      "end_line": 271,
      "comment": "\n     * Sets the modify time as a java.util.Date of this zip entry.\n     *\n     * @param d modify time as java.util.Date\n     ",
      "child_ranges": [
        "(line 271,col 45)-(line 271,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setAccessJavaTime(java.util.Date)",
      "begin_line": 279,
      "end_line": 279,
      "comment": "\n     * Sets the access time as a java.util.Date\n     * of this zip entry.\n     *\n     * @param d access time as java.util.Date\n     ",
      "child_ranges": [
        "(line 279,col 45)-(line 279,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setCreateJavaTime(java.util.Date)",
      "begin_line": 294,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d create time as java.util.Date\n     ",
      "child_ranges": [
        "(line 294,col 45)-(line 294,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.toString()",
      "begin_line": 303,
      "end_line": 311,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 48)",
        "(line 306,col 9)-(line 309,col 74)",
        "(line 310,col 9)-(line 310,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.equals(java.lang.Object)",
      "begin_line": 313,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.hashCode()",
      "begin_line": 326,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 22)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.reset()",
      "begin_line": 347,
      "end_line": 351,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 51)",
        "(line 349,col 9)-(line 349,col 51)",
        "(line 350,col 9)-(line 350,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.readTimeAttr(byte[], int, int)",
      "begin_line": 353,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPOCH_OFFSET"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " this is the offset of Windows time 0 to Unix epoch in 100-nanosecond intervals"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.dateToZip(java.util.Date)",
      "begin_line": 374,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 39)",
        "(line 376,col 9)-(line 376,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.zipToDate(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 379,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 77)",
        "(line 381,col 9)-(line 381,col 60)",
        "(line 382,col 9)-(line 382,col 27)"
      ]
    }
  ]
}