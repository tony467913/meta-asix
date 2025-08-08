# ASIX Layer for Yocto
This layer contains kernel recipes to add the ASIX AX88179 Driver to an image.


> **Note:** `meta-asix` is tested on Yocto Kirkstone.

# AX88179

## Usage
Before start: review the Yocto system requirements.

1. Install dependencies. Example for Debian/Ubuntu:
    ```bash
    apt-get install clang llvm
    ```
2. Download the `meta-asix` layer
3. Add the `meta-asix` layer to your `bblayers.conf` file
4. Add `IMAGE_INSTALL:append = " asix"` to `local.conf` file
5. Build your image, for example run:
    ```bash
    bitbake core-image-minimal
    ```

# Contributing
Feel free to utilize the GitHub PR workflow to share your patches. The following  guidelines are recommended: [Github PR guidelines](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request).

Layer maintainer: Gianluigi Spagnuolo <gianluigi@exein.io>


# License and Copyright
Copyright 2025 ASIX Electronics

All metadata is Apache 2-0 licensed unless otherwise stated. Source code included in tree for individual recipes is under the LICENSE stated in the associated recipe (.bb file) unless otherwise stated.

License information for any other files is either explicitly stated or defaults to Apache 2.0 license.
