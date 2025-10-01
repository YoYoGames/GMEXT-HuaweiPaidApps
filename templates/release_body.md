## IMPORTANT

- This extension version will be compatible with the GM 2022.0.1 LTSr1 (upon release)

## CHANGES SINCE ${releaseOldVersion}

https://github.com/YoYoGames/GMEXT-HuaweiPaidApps/compare/${releaseOldVersion}...${releaseNewVersion}

## DESCRIPTION

Lightweight integration of **Huawei Paid Apps DRM** for GameMaker projects distributed via AppGallery. It performs a license check against Huawei’s DRM service at runtime and reports the result back to your game via an Async Social event—so you can allow access when verified or handle failures gracefully.

## FEATURES 

- Performs a Huawei DRM license check for paid apps.
- Uses your configured DRM ID and public key (extension options).
- Returns results asynchronously through a single event.
- Includes error code reporting and (when applicable) the store package name.
- No UI shown to the player; simple pass/fail signal for your own flow.
- Minimal footprint and easy to drop into existing projects.

## DOCUMENTATION

The full documentation of the API is included in the extension asset (included files).